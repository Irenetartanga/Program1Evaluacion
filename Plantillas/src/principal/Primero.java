package principal;
// Importamos Scanner para poder introducir datos por teclado
import java.util.Scanner;
public class Primero {
	public static void main(String[] args) {
		// SCANNER
		// Creamos el Scanner para leer datos introducidos por teclado
		Scanner teclado = new Scanner(System.in);
		// VARIABLES
		// Números enteros
		int numero = 0;
		// Números con decimales
		double decimal = 0;
		// Texto
		String texto = "";
		// Verdadero / falso
		boolean correcto = false;
		// INTRODUCIR DATOS
		// Pedimos un número entero
		System.out.println("Introduce un número:");
		numero = teclado.nextInt();
		// Limpiamos el salto de línea que queda después de nextInt()
		teclado.nextLine();
		// Pedimos un texto
		System.out.println("Introduce un texto:");
		texto = teclado.nextLine();
		// IF / ELSE
		// Comprobamos una condición
		if (numero > 0) {
			// Se ejecuta si la condición es verdadera
			System.out.println("El número es positivo");
		} else {
			// Se ejecuta si la condición es falsa
			System.out.println("El número no es positivo");
		}
		// ELSE IF
		if (numero > 0) {
			System.out.println("Es positivo");
		} else if (numero < 0) {
			System.out.println("Es negativo");
		} else {
			System.out.println("Es cero");
		}
		// SWITCH
		switch (numero) {
		case 1:
			System.out.println("Has introducido 1");
			break;
		case 2:
			System.out.println("Has introducido 2");
			break;
		default:
			System.out.println("Otro número");
			break;
		}
		// WHILE
		int contador = 0;
		// Repite mientras la condición sea verdadera
		while (contador < 5) {
			System.out.println(contador);
			// Aumentamos el contador
			contador++;
		}
		// DO - WHILE
		int opcion;
		do {
			System.out.println("Introduce 1 para continuar o 0 para salir:");
			opcion = teclado.nextInt();
		} while (opcion != 0);
		// FOR
		// Repite el código 5 veces
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		// ARRAYS
		// Array de 5 números enteros
		int[] numeros = new int[5];
		// Guardamos valores en las posiciones del array
		numeros[0] = 10;
		numeros[1] = 20;
		numeros[2] = 30;
		// Recorremos el array
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		// CERRAR SCANNER
		// Cerramos el Scanner cuando ya no lo necesitamos
		teclado.close();
	}
}

