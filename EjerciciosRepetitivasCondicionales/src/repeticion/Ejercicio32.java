package repeticion;
import java.util.Scanner;

public class Ejercicio32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in); //Para hacer cosas con el teclado
		int numero1 = 1;
		System.out.println("Introduce un numero:");
		numero1 = teclado.nextInt();

		int numero2 = 2; //Para almacenar un numero entero
		System.out.println("Introduce un numero:");
		numero2 = teclado.nextInt();

		while (numero1==numero2) {
			System.out.println("Introduce un numero diferente:");
			numero2 = teclado.nextInt();

		}

		if (numero1<=numero2) {
			System.out.println("Tus numeros son " +numero2+ " y "+numero1 );
		}
		if (numero2<=numero1) {
			System.out.println("Tus numeros son " +numero1+ " y "+numero2 );

		}

		teclado.close();

	}

}
