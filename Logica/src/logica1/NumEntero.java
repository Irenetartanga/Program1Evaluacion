package logica1;
import java.util.Scanner;

public class NumEntero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);

		int numEntero = 0;
		
		System.out.println("Dime un numero entero");
		numEntero=teclado.nextInt();

		while (numEntero>1) {
			System.out.print(numEntero + ", ");
			if (numEntero%2==0) {
				numEntero=numEntero/2;
			} else {
				numEntero=numEntero*3+1;
			}
		}
		System.out.print(numEntero );
		teclado.close();
	}
}
