package ejercicios;
import java.lang.reflect.Array;
import java.util.Scanner;
public class NomNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);

		int [] arraynombres = new int [17];
		int [] arraynotas = new int [17];

		for (int contador = 0; contador<Array.getLength(arraynombres);contador++)
			
			System.out.println("Escribe los nombres: ");

		teclado.close();
	}

}
