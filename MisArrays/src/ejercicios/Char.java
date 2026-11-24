package ejercicios;
import java.util.Scanner;
public class Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("letras");
		int tamañoarray = teclado.nextInt();
		char [] arrayA = new char [tamañoarray];
		
		// para ir metiendo las letras
		for (int letras = 0; letras < tamañoarray; letras++) {
			System.out.print(letras + ": ");
			
			// crear la palabra
			String palabra = teclado.next();
			arrayA[letras] = palabra.charAt(0);
		}
		
		// imprimir la palabra
		System.out.println("palabra: ");
		System.out.println(arrayA);
		teclado.close();
	}
}
