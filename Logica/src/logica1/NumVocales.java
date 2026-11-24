package logica1;
import java.util.Scanner;

public class NumVocales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);

		String palabra;
		int vocales=0;
		char [] letras= {'a', 'e', 'i', 'o', 'u'};

		System.out.println("Dime una palabra");
		palabra=teclado.nextLine();

		for(int contador = 0; contador < palabra.length(); contador++) {
			for (int contadorVocales=0; contadorVocales< letras.length; contadorVocales++) {
				if (palabra.charAt(contador) == letras[contadorVocales]) {					
					vocales++;
				}
			}
		}

		teclado.close();
	}

}
