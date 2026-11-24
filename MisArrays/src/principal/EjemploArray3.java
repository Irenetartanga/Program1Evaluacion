package principal;
import java.util.Scanner;
public class EjemploArray3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Pedir al usuario 5 double, si son negativos no cuentan
		 * guardarlos en arrays (solo guardamos 5 positivos)
		 * cuando acabemos de rellenar el array lo mostramos por pantalla
		 */
		Scanner teclado = new Scanner(System.in);

		double [] arrayNumeros = new double [5]; // 5 es el tamao del array
		double total = 0;
		int contador = 0;

		while (contador<arrayNumeros.length)
		{
			System.out.println("Introduzca un numero positivo");
			arrayNumeros[contador]=Double.parseDouble(teclado.nextLine());
			if (arrayNumeros[contador]<0) {
				System.out.println("Introduzca un numero positivo");
			}else {
				total += arrayNumeros [contador]; 
				contador++;
			}
			for (contador = 0; contador<arrayNumeros.length; contador++)
			{
				System.out.println("Numero"+ (contador+1)+":" + arrayNumeros[contador]);
			}
			System.out.println(total);
			teclado.close();

		}
	}
}
