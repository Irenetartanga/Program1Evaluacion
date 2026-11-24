package repeticion;
import java.util.Scanner;
public class Ejercicio14 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner teclado = new Scanner(System.in);
	        int n;
	        System.out.println("Introduce un número:");
	        n = teclado.nextInt();
	        while (n >= 0) {
	            System.out.println(n);
	            n = n - 1; //tambien sirve n--;
	        }
	        teclado.close();
	    }
	}

