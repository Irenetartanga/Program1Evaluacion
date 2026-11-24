package principal;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in); //Para hacer cosas con el teclado

		int numero1 = 1; 
		
		System.out.println("Introduce un numeros:");
		numero1 = teclado.nextInt(); 
		
		int numero2 = 2; //Para almacenar un numero entero
		
		System.out.println("Introduce un numeros:");
		numero2 = teclado.nextInt(); 
		
		int resultado0 = 0; //Para almacenar un numero entero
		
		System.out.println("Introduce el resultado:");
		resultado0 = teclado.nextInt(); 
		
		if (numero1 + numero2==resultado0)
			System.out.println("Felicidades");
	
		else 
			System.out.println("No es correcto, el resultado es " + (numero1+numero2));


		
		teclado.close(); //Para que cierre el programa
	}

}
