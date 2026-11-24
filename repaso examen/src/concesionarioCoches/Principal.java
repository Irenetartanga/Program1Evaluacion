package concesionarioCoches;
import java.util.Scanner;

import concesionarioCoches.Coche;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);

		Coche[] coche = new Coche[3];
		coche[0] = new Coche("ABC 1234", "Toyota", "Rojo", 16, 3000);

		int contadorarray =0;
		int opcion=0;

		do {
			// las opciones del menu para elegir
			System.out.println("1. Opción: Introducir los datos de coche/s nuevos.");
			System.out.println("2. Opción: Listado de los coches introducidos. ");
			System.out.println("3. Opción: Listar aquellos coches que sean de una determinada marca");
			System.out.println("4. Opción: Listar los coches que sean de cualquiera de los dos colores");
			System.out.println("5. Opción: Sacar la media de los centímetros cúbicos de los coches introducidos");
			System.out.println("6. Opción: NO HACER");
			System.out.println("7. Opción: Suma del precio total de los coches");
			System.out.println("8. Opción: Modificar el precio a un coche concreto a partir de su matrícula. ");
			System.out.println("9. Opción: Resumen por colores");
			System.out.println("10. Opción: Eliminar un coche.");
			System.out.println("11. Opción: Salir del programa");
			System.out.print("Elige una opción: ");
			opcion = teclado.nextInt();
			teclado.nextLine();

			// las diferentes opciones
			switch (opcion) {
			case 1:
				Introducir (teclado, coche, contadorarray);
				break;
			case 2:
				Listado (teclado, coche, contadorarray);
				break;
			case 3:
				Marca (teclado, coche, contadorarray);
				break;
			case 4:
				Color (teclado, coche, contadorarray);
				break;
			case 5:
				Media (teclado, coche, contadorarray);
				break;
			case 6:
				Nada (teclado, coche, contadorarray);
				break;
			case 7:
				Suma (teclado, coche, contadorarray);
				break;
			case 8:
				Modificar (teclado, coche, contadorarray);
				break;
			case 9:
				Resumen (teclado, coche, contadorarray);
				break;
			case 10:
				Eliminar (teclado, coche, contadorarray);
				break;
			}
		}
		while (opcion != 11);
		System.out.println("Programa cerrado");
		teclado.close();
	}
	// 1. Introducir coches nuevos
	public static void Introducir (Scanner teclado, Coche[] coche, int contadorarray) {
	
		String respuesta;
		
		System.out.println("¿Cual es la matricula del coche?");
		respuesta = teclado.nextLine();

	}

	public static void Listado (Scanner teclado, Coche[] coche, int contadorarray) {
	}
	public static void Marca (Scanner teclado, Coche[] coche, int contadorarray) {
	}
	public static void Color (Scanner teclado, Coche[] coche, int contadorarray) {
	}
	public static void Media (Scanner teclado, Coche[] coche, int contadorarray) {
	}
	public static void Nada (Scanner teclado, Coche[] coche, int contadorarray) {
	}
	public static void Suma  (Scanner teclado, Coche[] coche, int contadorarray) {
	}
	public static void Modificar (Scanner teclado, Coche[] coche, int contadorarray) {
	}
	public static void Resumen (Scanner teclado, Coche[] coche, int contadorarray) {
	}
	public static void Eliminar (Scanner teclado, Coche[] coche, int contadorarray) {
	}
}


