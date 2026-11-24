package ejercicio;
import java.util.Scanner;

public class PruebaChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);

		String cadena = "Hola";
		for (int i=0; i<cadena.length(); i++) {
			System.out.println(cadena.charAt(i));
		}
	}
}
