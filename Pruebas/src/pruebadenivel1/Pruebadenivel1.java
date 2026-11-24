package pruebadenivel1;
import java.util.Scanner;
public class Pruebadenivel1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		//datos usuario
		String nombre;
		String apellido;
		int edad;
		//preguntas iniciales
		System.out.println("¿Cual es tu nombre?");
		nombre = teclado.next();
		System.out.println("¿Cual es tu apellido?");
		apellido = teclado.next();
		System.out.println("¿Cual es tu edad?");
		edad = teclado.nextInt();
		//condicion si tienes 18 o mas años para entrar
		if (edad>=18) {
			System.out.println("Bienvenido " + nombre + " " + apellido + " a la frutería." );
			//menu del sistema
			int numeromenu=0;
			do {
				System.out.println("1- Realizar una nueva compra");
				System.out.println("2- Comprobar si existe fruta");
				System.out.println("3- Introducir fruta");
				System.out.println("4- Salir");
				System.out.println("¿Que quieres realizar?");
				numeromenu = teclado.nextInt();
				teclado.nextLine();
				switch (numeromenu) {
				case 1:

					//para comprar frutas, solo 3
					//variables para la compra
					int contadorcompra = 1;
					int precioproducto = 0;
					int totalprecioproducto = 0;
					System.out.println("**Realizar compra**");
					while (contadorcompra<=3) {
						System.out.println("Introduce el precio del " + contadorcompra + " producto:" );
						precioproducto = teclado.nextInt();
						if (precioproducto < 0) {
							System.out.println("ERROR, introducelo de nuevo.");
						} else {
							totalprecioproducto = totalprecioproducto + precioproducto;
							contadorcompra++;
						}
					}
					System.out.println("Total: " + totalprecioproducto + "€");
					break;

				case 2:
					//para revisar si tenemos la fruta
					System.out.println("**Comprobar si existe fruta**");
					//variables para comprobacion
					String frutaexistente;
					boolean existenciafruta= false;
					String[] frutas = {"Manzana", "Banana", "Naranja"};
					System.out.println("Introduce el nombre de una fruta");
					frutaexistente = teclado.next(); 
					for (int contadorfruta=0; contadorfruta<frutas.length; contadorfruta++) {
						if (frutas[contadorfruta].equalsIgnoreCase(frutaexistente)) {
							existenciafruta = true;
						}
					}
					if (existenciafruta) {
						System.out.println("Si tenemos esa fruta.");
					} else {
						System.out.println("No tenemos esa fruta.");
					}
					break;
				case 3:
					//para añadir frutas al sistema (no se guardan las introducidas)
					//variables para añadir con contraseña
					String contraseña = "";
					String nombrefruta = "";
					System.out.println("**Introducir Fruta**");
					//ERROR, aparece dos veces el Introducir la contraseña
					do  {
						System.out.print("Para realizar esta acción necesitas ser administrador.\nIntroduce la contraseña:  ");
						contraseña = teclado.nextLine();	
					}
					while (!contraseña.equalsIgnoreCase("abc"));
					System.out.println("Introduce el nombre de la fruta:");
					nombrefruta = teclado.next();
					for (int repetir=0; repetir<3;repetir++) {
						System.out.println("La fruta " + nombrefruta + "se ha guardado.");
					}
					break;
				case 4:
					//para salir del sistema y despedirte
					System.out.println("**Salir**");
					System.out.println("Hasta luego " + nombre);
					break;
				}
			}
			while (numeromenu !=4);
		}
		//cuando no tienes ni 18 años
		else
			System.out.println("No puedes acceder en el sistema");
		teclado.close();
	}
}
