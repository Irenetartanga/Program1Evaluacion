package plantillas;
import java.util.Scanner;

public class ObjetosMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		// ARRAY: guarda hasta 50 elementos.
		String[] elementos = new String[50];

		// CONTADOR: indica cuántas posiciones están ocupadas.
		int contador = 0;

		int opcion;

		// MENÚ: se repite hasta elegir salir.
		do {

			System.out.println("\n--- MENU ---");
			System.out.println("1. Añadir elemento");
			System.out.println("2. Mostrar elementos");
			System.out.println("3. Buscar elemento");
			System.out.println("4. Eliminar elemento");
			System.out.println("5. Salir");

			System.out.println("Elige una opción:");
			opcion = teclado.nextInt();
			teclado.nextLine(); // Limpiar el salto de línea.

			switch (opcion) {

			case 1:
				// El método devuelve el contador actualizado.
				contador = Anadir(teclado, elementos, contador);
				break;

			case 2:
				Mostrar(elementos, contador);
				break;

			case 3:
				Buscar(teclado, elementos, contador);
				break;

			case 4:
				// El método devuelve el contador actualizado.
				contador = Eliminar(teclado, elementos, contador);
				break;

			case 5:
				System.out.println("Saliendo...");
				break;

			default:
				System.out.println("Opción incorrecta.");
				break;
			}

		} while (opcion != 5);

		teclado.close();
	}

	// AÑADIR: comprobar que el array tiene espacio.
	public static int Anadir(Scanner teclado, String[] elementos, int contador) {

		if (contador >= elementos.length) {
			System.out.println("El array está lleno.");
		} else {

			System.out.println("Introduce el elemento:");
			String nombre = teclado.nextLine();

			// Comprobar si ya existe.
			boolean repetido = false;

			for (int i = 0; i < contador; i++) {

				if (elementos[i].equalsIgnoreCase(nombre)) {
					repetido = true;
				}
			}

			if (repetido == true) {
				System.out.println("Ese elemento ya existe.");
			} else {
				elementos[contador] = nombre;
				contador++;

				System.out.println("Elemento añadido.");
			}
		}

		return contador;
	}

	// MOSTRAR: recorrer las posiciones ocupadas.
	public static void Mostrar(String[] elementos, int contador) {

		if (contador == 0) {
			System.out.println("El array está vacío.");
		} else {

			for (int i = 0; i < contador; i++) {
				System.out.println(elementos[i]);
			}
		}
	}

	// BUSCAR: comprobar si existe un elemento.
	public static void Buscar(Scanner teclado, String[] elementos, int contador) {

		System.out.println("¿Qué elemento quieres buscar?");
		String nombre = teclado.nextLine();

		boolean encontrado = false;

		for (int i = 0; i < contador; i++) {

			if (elementos[i].equalsIgnoreCase(nombre)) {

				System.out.println("Encontrado: " + elementos[i]);
				encontrado = true;
				break;
			}
		}

		if (encontrado == false) {
			System.out.println("No existe ese elemento.");
		}
	}

	// ELIMINAR: desplazar los elementos hacia la izquierda.
	public static int Eliminar(Scanner teclado, String[] elementos, int contador) {

		System.out.println("¿Qué elemento quieres eliminar?");
		String nombre = teclado.nextLine();

		boolean encontrado = false;

		for (int i = 0; i < contador; i++) {

			if (elementos[i].equalsIgnoreCase(nombre)) {

				encontrado = true;

				// Desplazar los elementos posteriores.
				for (int j = i; j < contador - 1; j++) {
					elementos[j] = elementos[j + 1];
				}

				// Vaciar la última posición ocupada.
				elementos[contador - 1] = null;

				contador--;

				System.out.println("Elemento eliminado.");
				break;
			}
		}

		if (encontrado == false) {
			System.out.println("No se ha encontrado.");
		}

		return contador;
	}
}