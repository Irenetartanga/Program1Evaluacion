package principal;
import java.util.Random;
public class GenerarAleatorio {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random numeroAleatorio = new Random();

		//Genera un numero comprendido entre el 1 y el 5
		System.out.println((numeroAleatorio.nextInt(5-1+1)+1));


		//Genera un numero comprendido entre el 3 y el 9
		System.out.println((numeroAleatorio.nextInt(7)+3));


		//numeroAleatorio.nextInt(maximo+1)+minimo
	}

}
