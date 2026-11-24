package ejemplos;
import java.util.Scanner;

public class Whilebooleansencillo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*	1º Pide un numero al usuario
		 * 	2º Mientras sea positivo muestra por pantalla el mensaje
		 * El numero introducido es ...
		 * 	3º Si es negativo finaliza el programa
		 */
		
		boolean salir=false;
		Scanner teclado= new Scanner(System.in); //Para hacer cosas con el teclado

		while (salir==false)
		{
			System.out.println("Introduce un numero:");
			int numero=Integer.parseInt(teclado.nextLine());
			if (numero>0)
				System.out.println("El numero introducido es " +numero);
			else
				salir=true;

		}
		System.out.println("Finalizo");
		teclado.close(); //Para que cierre el programa
		
	}

}
