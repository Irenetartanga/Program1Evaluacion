package repeticion;
import java.util.Scanner;
public class Ejercicio31 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numeroMin;
		int numeroMax;
		int numero;
		boolean divisible = false;
		Scanner teclado= new Scanner(System.in); //Para hacer cosas con el teclado

		System.out.println("Introduce el minimo: ");
		numeroMin = teclado.nextInt();
		System.out.println("Introduce el maximo: ");
		numeroMax = teclado.nextInt();
		numero=numeroMin;

		while (numeroMin>numeroMax) {
			System.out.println("Introduce un numero mayor:");
			numeroMax = teclado.nextInt();
		}
		while (numero <=numeroMax) {
			if (numero%7 ==0) {
				System.out.println(numero+" divisibles por 7");
				divisible = true; 
			}
			numero++;
		}
		if (divisible ==false) {
			System.out.println("No hay divisibles por 7");
		}
		teclado.close();	
	}

}

