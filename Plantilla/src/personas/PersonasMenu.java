package personas;
import java.util.Scanner;

public class PersonasMenu {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		// Array para guardar hasta 50 personas.
		PersonasObjeto [] personas = new PersonasObjeto[50];

		// Número de personas guardadas.
		int contador = 0;

		int opcion;

		do {

			System.out.println("\n--- MENU PERSONAS ---");
			System.out.println("1. Añadir persona");
			System.out.println("2. Mostrar todas");
			System.out.println("3. Buscar por DNI");
			System.out.println("4. Mostrar mayores de edad");
			System.out.println("5. Contar mayores y menores");
			System.out.println("6. Mostrar personas por edad");
			System.out.println("7. Modificar persona");
			System.out.println("8. Eliminar persona");
			System.out.println("9. Salir");

			System.out.println("Elige una opción:");
			opcion = teclado.nextInt();
			teclado.nextLine();

			switch (opcion) {

			case 1:
				contador = Anadir(teclado, personas, contador);
				break;

			case 2:
				Mostrar(personas, contador);
				break;

			case 3:
				Buscar(teclado, personas, contador);
				break;

			case 4:
				Mayores(personas, contador);
				break;

			case 5:
				Contar(personas, contador);
				break;

			case 6:
				PorEdad(teclado, personas, contador);
				break;

			case 7:
				Modificar(teclado, personas, contador);
				break;

			case 8:
				contador = Eliminar(teclado, personas, contador);
				break;

			case 9:
				System.out.println("Saliendo...");
				break;

			default:
				System.out.println("Opción incorrecta.");
				break;
			}

		} while (opcion != 9);

		teclado.close();
	}

	// AÑADIR PERSONA.
	public static int Anadir(Scanner teclado, PersonasObjeto[] personas, int contador) {

		// Comprobar si hay espacio en el array.
		if (contador >= personas.length) {

			System.out.println("No hay espacio.");

		} else {

			System.out.println("Introduce el nombre:");
			String nombre = teclado.nextLine();

			System.out.println("Introduce el DNI:");
			String dni = teclado.nextLine();

			// Comprobar formato básico del DNI.
			while (dni.length() != 9) {

				System.out.println("El DNI debe tener 9 caracteres.");
				dni = teclado.nextLine();
			}

			// Comprobar que el DNI no esté repetido.
			boolean repetido = false;

			for (int i = 0; i < contador; i++) {

				if (personas[i].getDni().equalsIgnoreCase(dni)) {
					repetido = true;
				}
			}

			if (repetido == true) {

				System.out.println("Ese DNI ya existe.");

			} else {

				System.out.println("Introduce la edad:");
				int edad = teclado.nextInt();
				teclado.nextLine();

				// Comprobar que la edad no sea negativa.
				while (edad < 0) {

					System.out.println("La edad no puede ser negativa.");
					edad = teclado.nextInt();
					teclado.nextLine();
				}

				// Crear y guardar el objeto.
				personas[contador] = new PersonasObjeto(nombre, dni, edad, true);

				contador++;

				System.out.println("Persona añadida.");
			}
		}

		return contador;
	}

	// MOSTRAR TODAS LAS PERSONAS.
	public static void Mostrar(PersonasObjeto[] personas, int contador) {

		if (contador == 0) {

			System.out.println("No hay personas.");

		} else {

			for (int i = 0; i < contador; i++) {

				System.out.println(personas[i].mostrarPersona());
			}
		}
	}

	// BUSCAR PERSONA POR DNI.
	public static void Buscar(Scanner teclado, PersonasObjeto[] personas, int contador) {

		System.out.println("Introduce el DNI:");
		String dni = teclado.nextLine();

		boolean encontrado = false;

		for (int i = 0; i < contador; i++) {

			if (personas[i].getDni().equalsIgnoreCase(dni)) {

				System.out.println(personas[i].mostrarPersona());

				encontrado = true;
				break;
			}
		}

		if (encontrado == false) {
			System.out.println("Persona no encontrada.");
		}
	}

	// MOSTRAR SOLO MAYORES DE EDAD.
	public static void Mayores(PersonasObjeto[] personas, int contador) {

		for (int i = 0; i < contador; i++) {

			if (personas[i].getEdad() >= 18) {

				System.out.println(personas[i].mostrarPersona());
			}
		}
	}

	// CONTAR MAYORES Y MENORES.
	public static void Contar(PersonasObjeto[] personas, int contador) {

		int mayores = 0;
		int menores = 0;

		for (int i = 0; i < contador; i++) {

			if (personas[i].getEdad() >= 18) {
				mayores++;
			} else {
				menores++;
			}
		}

		System.out.println("Mayores de edad: " + mayores);
		System.out.println("Menores de edad: " + menores);
	}

	// MOSTRAR PERSONAS SEGÚN UNA EDAD.
	public static void PorEdad(Scanner teclado, PersonasObjeto[] personas, int contador) {

		System.out.println("Introduce una edad:");
		int edad = teclado.nextInt();
		teclado.nextLine();

		boolean encontrado = false;

		for (int i = 0; i < contador; i++) {

			if (personas[i].getEdad() == edad) {

				System.out.println(personas[i].mostrarPersona());
				encontrado = true;
			}
		}

		if (encontrado == false) {
			System.out.println("No hay personas con esa edad.");
		}
	}

	// MODIFICAR UNA PERSONA.
	public static void Modificar(Scanner teclado, PersonasObjeto[] personas, int contador) {

		System.out.println("Introduce el DNI de la persona:");
		String dni = teclado.nextLine();

		boolean encontrado = false;

		for (int i = 0; i < contador; i++) {

			if (personas[i].getDni().equalsIgnoreCase(dni)) {

				encontrado = true;

				System.out.println("Introduce el nuevo nombre:");
				String nombre = teclado.nextLine();

				System.out.println("Introduce la nueva edad:");
				int edad = teclado.nextInt();
				teclado.nextLine();

				while (edad < 0) {

					System.out.println("La edad no puede ser negativa.");
					edad = teclado.nextInt();
					teclado.nextLine();
				}

				personas[i].setNombre(nombre);
				personas[i].setEdad(edad);

				System.out.println("Persona modificada.");

				break;
			}
		}

		if (encontrado == false) {
			System.out.println("Persona no encontrada.");
		}
	}

	// ELIMINAR UNA PERSONA.
	public static int Eliminar(Scanner teclado, PersonasObjeto[] personas, int contador) {

		System.out.println("Introduce el DNI:");
		String dni = teclado.nextLine();

		boolean encontrado = false;

		for (int i = 0; i < contador; i++) {

			if (personas[i].getDni().equalsIgnoreCase(dni)) {

				encontrado = true;

				// Desplazar las personas hacia la izquierda.
				for (int j = i; j < contador - 1; j++) {

					personas[j] = personas[j + 1];
				}

				// Vaciar la última posición ocupada.
				personas[contador - 1] = null;

				contador--;

				System.out.println("Persona eliminada.");

				break;
			}
		}

		if (encontrado == false) {
			System.out.println("Persona no encontrada.");
		}

		return contador;
	}
}
