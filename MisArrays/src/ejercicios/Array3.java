package ejercicios;
import java.util.Random;
public class Array3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random numeroAleatorio = new Random();
		int[] arraynumerosA = new int[10];
		int[] arraynumerosB = new int[10];
		int[] arraynumerosC = new int[20];

		// rellenar arrayA con numeros aleatorios entre 1 y 100
		for (int contadorA = 0; contadorA < arraynumerosA.length; contadorA++) {
			arraynumerosA[contadorA] = numeroAleatorio.nextInt(100) + 1;
			System.out.println("Numero A " + (contadorA + 1) + ": " + arraynumerosA[contadorA]);
		}

		// rellenar arrayB con numeros aleatorios entre 1 y 100
		for (int contadorB = 0; contadorB < arraynumerosB.length; contadorB++) {
			arraynumerosB[contadorB] = numeroAleatorio.nextInt(100) + 1;
			System.out.println("Numero B " + (contadorB + 1) + ": " + arraynumerosB[contadorB]);
		}

		// copiar arrayA en las 10 primeras posiciones de arrayC
		for (int contador = 0; contador < arraynumerosA.length; contador++) {
			arraynumerosC[contador] = arraynumerosA[contador];
		}

		// copiar arrayB en las 10 ultimas posiciones de arrayC
		for (int contador = 0; contador < arraynumerosB.length; contador++) {
			arraynumerosC[contador + 10] = arraynumerosB[contador];
		}

		// mostrar arrayC
		System.out.println("Array C:");
		for (int contadorC = 0; contadorC < arraynumerosC.length; contadorC++) {
			System.out.println("Numero C " + (contadorC + 1) + ": " + arraynumerosC[contadorC]);
		}
	}
}

