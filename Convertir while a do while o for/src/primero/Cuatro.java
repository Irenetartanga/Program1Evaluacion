package primero;
import java.util.Scanner;
public class Cuatro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int numero = 7;
		for (int i = 0;i <= 10;) {
		    System.out.println(numero + " x " + i + " = " + (numero * i));
		    i++;
	}

		sc.close();
	}

}
