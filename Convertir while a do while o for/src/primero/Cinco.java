package primero;
import java.util.Scanner;
public class Cinco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int opcion = 0;

		do {
			System.out.println("1. Alta");
			System.out.println("2. Baja");
			System.out.println("3. Consulta");
			System.out.println("4. Salir");

			System.out.print("Elige una opción: ");
			opcion = sc.nextInt();

			if (opcion == 2) {
				System.out.println("Has elegido Baja");
			} else if (opcion == 3) {
				System.out.println("Has elegido Consulta");
			} else if (opcion == 1) {
				System.out.println("Has elegido Alta");
			}
		}
		while (opcion != 4); {
			System.out.println("Salir");
			sc.close();
		}
	}
}
