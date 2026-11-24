package primero;
import java.util.Scanner;
public class Tres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String contraseña = "";
		do  {
			System.out.print("Introduce la contraseña: ");
			contraseña = sc.nextLine();

			if (contraseña.equals("java123")) {

			}
		}
		while (!contraseña.equals("java123")); {
			System.out.println("Acceso permitido.");
			sc.close();
		}
	}
}
