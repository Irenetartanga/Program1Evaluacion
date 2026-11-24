package ejemplos;

import java.util.Scanner;

public class Whileboolean10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean salir=false;
		Scanner teclado= new Scanner(System.in); //Para hacer cosas con el teclado
		int numerointroducir=0;

		while (salir==false)
		{
			if (numerointroducir==0)
			System.out.println("Introduce un numero:");
			int numero=Integer.parseInt(teclado.nextLine());
			System.out.println("Es lunes y has introducido el numero " +numero);
			numerointroducir=numerointroducir+1;
			if (numerointroducir==10)
				salir=true;
		}
		System.out.println("Finalizo");
		teclado.close(); //Para que cierre el programa
	}

}
