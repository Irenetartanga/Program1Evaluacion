package primero;
import java.util.Scanner;
public class Uno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int numero;
		int contador = 0;

		do {
			System.out.print("Introduce un número: ");
			numero = sc.nextInt();

			if (numero > 0) {
				contador++;

			}
		}

		while (numero>= 0);
		System.out.println("Has introducido " + contador + " números positivos.");
		sc.close();

	}

}
