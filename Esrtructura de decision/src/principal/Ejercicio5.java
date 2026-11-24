package principal;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in); //Para hacer cosas con el teclado
		
		float notamaxima = 0; 
		
		System.out.println("Introduce la nota maxima posible:");
		notamaxima = teclado.nextFloat(); 
		
		float notaalumno = 0; 
		
		System.out.println("Introduce tu nota:");
		notaalumno = teclado.nextFloat();
					
		
		int trabajosHechos; 
		
		System.out.println("¿Has hecho todos los trabajos? Intro 1 si es que si");
		trabajosHechos=teclado.nextInt();
	
		
		
		
		teclado.close(); //Para que cierre el programa

	}

}
