package principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int entero = 0; //Para almacenar un numero entero
		float flotante; //Para almacenar numeros con decimales
		double doble; // Para almacenar numeros con decimales con más decimales
		char character; //Para almacenar 1 caracter
		Scanner teclado= new Scanner(System.in); //Para hacer cosas con el teclado
		
		System.out.println("Introduce un entero:");
		entero = teclado.nextInt(); //Se queda parado hasta que se le de a un numero y entero
		System.out.println("Introduce un flotante (Recuerda usar la coma cuando haya decimales):");
		flotante = teclado.nextFloat();
		System.out.println("flotante");
		System.out.println("Introduce un doble (Recuerda usar la coma cuando haya decimales)::");
		doble = teclado.nextDouble();
		System.out.println(doble);
		teclado.close(); //Para que cierre el programa
	}

}
