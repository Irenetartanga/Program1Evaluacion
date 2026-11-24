package primero;
import java.util.Scanner;
public class Dos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int numero = 1;

		for (int i=0 ; numero <= 20; i++) {
			System.out.println(numero);
			numero++;
		}

		sc.close();

	}
}
