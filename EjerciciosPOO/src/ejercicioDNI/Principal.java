package ejercicioDNI;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);

		int posicion=0;

		// tabla de letras para la comprobacion
		String tablaletras = "TRWAGMYFPDXBNJZSQVHLCKE";

		System.out.print("Introduce tu DNI: ");
		String dni = teclado.nextLine().toUpperCase();

		if (dni.matches("^[0-9]{8}[A-Za-z]$")) {
			System.out.println("Formato correcto");
		} else {
			System.out.println("Formato incorrecto");
		}	

		// para sacar la letra del dni que es correcta
		// cambiar los numeros del dni en un int con el paseInt
		// (dni.substring(0,8) es una variables realmente

		if(tablaletras.charAt(Integer.parseInt(dni.substring(0,8))%23)==dni.charAt(8)) {
			/*letra bien*/
			System.out.println("DNI correcto con su letra " + dni);

		} else {
			System.out.println("DNI incorrecto con su letra");
			System.out.println("La letra correcta seria: "+ tablaletras.charAt(Integer.parseInt(dni.substring(0,8))%23));
			System.out.println("DNI correcto con su letra " +dni.substring(0,8)+ tablaletras.charAt(Integer.parseInt(dni.substring(0,8))%23));


		}


		// el método matches devuelve true si el dni introducido tiene el formato definido  
		// ^[0-9]{8}[A-Za-z]$


	}




}
