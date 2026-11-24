package diaSemana;
import java.util.Scanner;
public class EjemploEnumDiaSemana
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		DiaSemana dia = DiaSemana.LUNES;

		if (dia == DiaSemana.LUNES) 
		{
			System.out.println("Empieza la semana laboral");
			System.out.println("El día elegido es: " + dia);        
		}

		System.out.print("Introduce un día de la semana: ");
		String texto = sc.nextLine();
		

		// Convertir String a DiaSemana
		DiaSemana dias = DiaSemana.valueOf(texto.toUpperCase());
		sc.close();
	}
}
