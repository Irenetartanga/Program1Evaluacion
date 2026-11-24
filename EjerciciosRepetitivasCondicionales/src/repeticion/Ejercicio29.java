package repeticion;
import java.util.Scanner;
public class Ejercicio29 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int numero;
		int suma = 0;
		int contador = 0;
		double media;
		while (contador < 10) {
			System.out.println("Introduce un número:");
			numero = teclado.nextInt();
			if (numero == 0) {
				System.out.println("Has introducido 0 y el programa finalizará");
			}
			suma = suma + numero;
			contador++;
		}
		media = (double) suma / contador;
		System.out.println("La suma es: " + suma);
		System.out.println("La media es: " + media);
		teclado.close();

	}

}
