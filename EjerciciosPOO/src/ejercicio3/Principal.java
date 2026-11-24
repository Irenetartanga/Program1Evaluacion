package ejercicio3;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);

		Personas [] aPersonas= new Personas [3];
		aPersonas [0]= new Personas ("Paco", 30, "1234567S");
		int opcion;

		/*Vamos a crear un programa que me gestione Personas. 
		 * Nuestro programa podrá manipular hasta 10 personas distintas. 
		 * Basando te en el ejercicio 1, crea una aplicación que gestione el siguiente menú.
			1. Introducir las personas (pedimos los datos de TODAS las personas y los almacenamos para usos posteriores).
			2. Muestra la persona de mayor edad.
			3. Muestra la información de una persona tras introducir su DNI.
			4. Muestra la información de todas las personas.
			5. Salir*/

		do {
			System.out.println("MENU");
			System.out.println("1. Introducir las personas");
			System.out.println("2. Muestra la persona de mayor edad");
			System.out.println("3. Muestra la información de una persona tras introducir su DNI");
			System.out.println("4. Muestra la información de todas las personas");
			System.out.println("5. Salir");

			System.out.print("Elige una opción: ");
			opcion = teclado.nextInt();
			teclado.nextLine();

			switch (opcion) {
			case 1:
				introducirPersonas(teclado, aPersonas);
				break;
			case 2:
				mayor(teclado, aPersonas);
				break;
			case 3:
				personaDni(teclado, aPersonas);
				break;
			case 4:
				mostrar(teclado, aPersonas);
				break;
			case 5:
				System.out.println("Has salido del menú");
				break;
			}
		}while (opcion!=5);		
		teclado.close();
	}

	public static void introducirPersonas(Scanner teclado, Personas[] personas) {

		for (int contador=0; contador<personas.length; contador++) {
			/*nombre*/
			System.out.println("introduce el nombre de la persona");
			String nombre=teclado.nextLine();
			/*edad*/
			System.out.println("introduce la edad");
			int edad=teclado.nextInt();
			teclado.nextLine();

			/*dni*/
			System.out.println("introduce el dni");
			String dni=teclado.nextLine();

			// tabla de letras para la comprobacion
			String tablaletras = "TRWAGMYFPDXBNJZSQVHLCKE";

			while (dni.matches("^[0-9]{8}[A-Za-z]$")) {
				if ()

			}
			// para sacar la letra del dni que es correcta
			// cambiar los numeros del dni en un int con el paseInt
			// (dni.substring(0,8) es una variables realmente

			if(tablaletras.charAt(Integer.parseInt(dni.substring(0,8))%23)==dni.charAt(8)) {
				/*letra bien*/
				System.out.println("DNI correcto con su letra " + dni);

			} else {
				System.out.println("DNI incorrecto con su letra");
				System.out.println("La letra correcta seria: "+ tablaletras.charAt(Integer.parseInt(dni.substring(0,8))%23));
				System.out.println("DNI correcto con su letra " +dni.substring(0,8)+ tablaletras.charAt(Integer.parseInt(dni.substring(0,8))%23));

			}
			personas[contador]=new Personas(nombre, edad, dni);			

		}
	}

	public static void mayor(Scanner teclado, Personas[] personas) {
		int personaMayor=0;
		for (int contador=0; contador<personas.length; contador++) {
			if (personas[contador].getEdad()>personaMayor) {
				personaMayor=personas[contador].getEdad();
			}
		}
		System.out.println("La persona de mayor edad es: " + " " + personaMayor);
	}

	public static void personaDni (Scanner teclado, Personas[] personas) {
		System.out.println("Introduce dni de la persona que quieres ver");
		String dni=teclado.nextLine().toUpperCase();
		for(int contador=0; contador<personas.length; contador++) {
			if (personas[contador].getDNI().equals(dni)) {
				System.out.println(personas[contador]);
			}
		}			
	}
	public static void mostrar(Scanner teclado, Personas[] personas) {

		for(int contador=0; contador<personas.length; contador++) {
			if (personas[contador]!=null) {
				System.out.println(personas[contador].toString());
			}
		}
	}
}

