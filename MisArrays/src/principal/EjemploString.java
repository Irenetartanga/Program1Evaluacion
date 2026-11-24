package principal;
public class EjemploString {
	public static void main(String[] args) {
		String[] frutas = {"Manzana", "Banana", "Naranja"};
		int contador=0;

		
		for (contador=0;contador<frutas.length;contador++) {
			if (frutas[contador].length() == 10)
				System.out.println(frutas[contador]);

		}
		if (frutas[contador].length() != 10)
			System.out.println("No hay ninguno que tenga 10 letras");
	}
}


