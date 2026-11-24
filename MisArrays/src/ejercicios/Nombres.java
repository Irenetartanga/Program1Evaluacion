package ejercicios;
import java.util.Scanner;
public class Nombres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);

		/*
		 * Supón que un array de String que contiene los nombres del alumnado y otro array con los apellidos
Pídele al usuario un nombre y que te devuelva:
- los apellidos del alumnado con ese nombre
- cuantas personas hay con ese nombre

En caso de que no haya nadie con ese nombre que lo indique con un mensaje
		 */
		String[] nombres = {"Arthur", "Anali", "Jon", "Gloria", "Paula","Irene"};
		String[] apellidos = {"Da Silva", "Mateos", "Gonzalez", "Tercero", null, ""};

		System.out.println("¿Que nombre tienes?");
		String buscarnombre = teclado.nextLine();
		boolean gente = false;

		for (int contador=0; contador<nombres.length; contador++) {
			if (nombres[contador].equalsIgnoreCase(buscarnombre)) {
				if ((apellidos[contador]==null) || (apellidos[contador]=="")) {
					System.out.println("No tiene apellido");	
				}
				else
					System.out.println(apellidos[contador]);	
				gente = true;
			}

		}

		teclado.close();
	}
}
