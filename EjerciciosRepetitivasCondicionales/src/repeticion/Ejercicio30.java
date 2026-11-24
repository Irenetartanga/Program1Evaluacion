package repeticion;
import java.util.Scanner;
public class Ejercicio30{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int numero;
		int suma = 0;
		int contador = 0;
		while (contador < 10) {
			System.out.println("Introduce un número:");
			numero = teclado.nextInt();
			if (numero >= 0) {
				suma = suma + numero;
			}
			contador++;
		}
		System.out.println("La suma de los números es: " + suma);
		teclado.close();
	}
}
