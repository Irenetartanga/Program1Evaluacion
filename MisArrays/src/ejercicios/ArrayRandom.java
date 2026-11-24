package ejercicios;
import java.util.Scanner;
import java.util.Random;
public class ArrayRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		Random numeroAleatorio = new Random();
		
		// variables
		String[] frutas = {"Manzana", "Pera", "Platano", "Naranja", "Fresa", "Sandia", "Melon", "Kiwi", "Mango", "Cereza"};
		double[] precios = new double[10];

		// rellenar los precios aleatoriamente
		for (int contador = 0; contador < precios.length; contador++) {
			precios[contador] = numeroAleatorio.nextInt(5) + 1;
			System.out.println(frutas[contador] + ": " + precios[contador] + " €");
		}

		// pedir una fruta para mostrar precio
		System.out.println("¿Que fruta quieres buscar?");
		String frutaBuscada = teclado.next();
		boolean encontrada = false;

		// buscar la fruta
		for (int contador = 0; contador < frutas.length; contador++) {
			if (frutas[contador].equalsIgnoreCase(frutaBuscada)) {
				System.out.println("El precio de " + frutas[contador] + " es " + precios[contador] + " €");
				encontrada = true;
			}
		}

		// si no se ha encontrado
		if (encontrada == false) {
			System.out.println("La fruta no existe.");
		}
		teclado.close();
	}
}


