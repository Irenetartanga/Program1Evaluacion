package principal;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner teclado= new Scanner(System.in); //Para hacer cosas con el teclado

		int numero1 = 1; 
		
		System.out.println("Introduce un numeros:");
		numero1 = teclado.nextInt(); 
		
		int numero2 = 2; //Para almacenar un numero entero
		
		System.out.println("Introduce un numeros:");
		numero2 = teclado.nextInt(); 
		
		if (numero1 > numero2) 
			System.out.println("numero 1 es mayor que numero 2");
		
		if (numero2 > numero1) 
			System.out.println("numero 2 es mayor que numero 1");		
		
		if (numero2 == numero1) 
			System.out.println("los numeros son iguales");
		
		teclado.close(); //Para que cierre el programa
	}

}