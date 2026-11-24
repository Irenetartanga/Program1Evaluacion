package semáforo;
import java.util.Scanner;
import diaSemana.DiaSemana;
public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);

		String semaforo;
		System.out.print("Introduce el estado del semaforo: ");
		semaforo = teclado.nextLine();

		EstadoSemaforo estado = EstadoSemaforo.valueOf(semaforo.toUpperCase());

			if (estado == EstadoSemaforo.ROJO) 
			{
				System.out.println("El semaforo esta en rojo, tienes que detenerte "); 

			}

			else if (estado == EstadoSemaforo.AMARILLO) 
			{
				System.out.println("El semaforo esta en amarillo, tienes que prepararte para deterte "); 

			}

			else if (estado == EstadoSemaforo.VERDE) 
			{
				System.out.println("El semaforo esta en verde, tienes que continuar "); 

			}
			



		teclado.close();
	}
}
