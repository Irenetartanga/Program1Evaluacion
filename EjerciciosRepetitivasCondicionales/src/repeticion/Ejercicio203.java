package repeticion;
import java.util.Scanner;

public class Ejercicio203 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       Scanner teclado = new Scanner(System.in);
	       int contador=1;
	       int numero;
	       int total = 0;
	       boolean parar = false;
	       System.out.println(System.in);
	       
	       while(parar == false && contador<=10) {
	           System.out.println("Introduce un número:");
	           numero=teclado.nextInt();
	           	if(numero==0) {
	 	           System.out.println("Has introducido el numero 0");
	 	           parar = true;

	           	}
	       total=total+numero;
	       contador=contador+1;
	       }
	           System.out.println("La suma de los numeros es: " +total);
	           teclado.close();
	}
}

	       
     