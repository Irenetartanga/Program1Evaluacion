package principal;
import java.util.Scanner;
public class EjemploArrays3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Pedir al usuario 5 double, si son negativos no cuentan
		 * guardarlos en arrays (solo guardamos 5 positivos)
		 * cuando acabemos de rellenar el array lo mostramos por pantalla
		 */
		Scanner teclado = new Scanner(System.in);

		//Double arrayNumerosOtraForma[] = new Double [5];
		double [] arrayNumeros = new double [5]; // 5 es el tamao del array
		double total = 0;

		//Bucle for para rellenar el array de numeros positivos
		for (int contador = 0; contador<arrayNumeros.length; contador++)
		{
			/*Pedimos numero al usuario y guardarlo en una variable	numIntro
			 * si numIntro es negativo no me sirve, le tengo que pedir otro hasta que sea positivo
			 * sigo en el for 
			 * si nuIntro es positivo si me sirve, lo guardo en el array y salgo del for
			 */
			while (true) {
				System.out.println("Introduzca un numero positivo");
				arrayNumeros[contador]=Double.parseDouble(teclado.nextLine());
				if (arrayNumeros[contador]<0) {
					System.out.println("Introduzca un numero positivo");
				}else {
					total += arrayNumeros [contador];
					break;
				}
			}
		}
		for (int contador = 0; contador<arrayNumeros.length; contador++)
		{
			System.out.println("Numero"+ (contador+1)+":" + arrayNumeros[contador]);
		}
		System.out.println(total);

		teclado.close();
	}

}
