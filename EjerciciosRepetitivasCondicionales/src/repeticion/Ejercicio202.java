package repeticion;
import java.util.Scanner;

public class Ejercicio202 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       Scanner teclado = new Scanner(System.in);
	       
           System.out.println("Introduce un número:");
           int numero=Integer.parseInt(teclado.nextLine());
           int contador=1;
           int suma = 1;
           while (contador <=numero) {
        		suma=suma * contador;
        		contador++;
        		}
           System.out.println(suma);
           teclado.close();

	}

}
