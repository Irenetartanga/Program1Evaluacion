package principal;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int entero = 0; //Para almacenar un numero entero
		
		Scanner teclado= new Scanner(System.in); //Para hacer cosas con el teclado
		
		System.out.println("Introduce un entero:");
		entero = teclado.nextInt(); //Se queda parado hasta que se le de a un numero y entero
		
		if (entero %2 == 0)
		System.out.println("Es divisible entre 2");
		
		if (entero %3 == 0)
			System.out.println("Es divisible entre 3");
		
		if (entero %5 == 0)
			System.out.println("Es divisible entre 5");
			
		teclado.close(); //Para que cierre el programa
	}

}
