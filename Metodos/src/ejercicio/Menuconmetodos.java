package ejercicio;
import java.util.Scanner;
import java.util.Random;
public class Menuconmetodos {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int opcion;
		// para mostrar el menu al menos una vez
		do {
			// las diferentes opciones del menu
			System.out.println("1. Opción A");
			System.out.println("2. Opción B");
			System.out.println("3. Opción C");
			System.out.println("4. Opción D");
			System.out.println("5. Opción E");
			System.out.println("6. Opción F");
			System.out.println("7. Opción G");
			System.out.println("8. Opción H");
			System.out.println("9. Opción I");
			System.out.println("10. Opción K para salir");
			System.out.print("Elige una opción: ");
			opcion = sc.nextInt();
			// el switch con las opciones del menu
			switch (opcion) {
			case 1: // terminado
				opcionA(sc);
				break;
			case 2: // terminado
				opcionB(sc);
				break;
			case 3: // terminado
				opcionC(sc);
				break;
			case 4: // terminado
				opcionD(sc);
				break;
			case 5: // terminado
				opcionE(sc);
				break;
			case 6: // terminado
				opcionF(sc);
				break;
			case 7: // NO terminado
				opcionG(sc);
				break;
			case 8: // comenzada pero no ordena
				opcionH(sc);
				break;
			case 9: // NO terminado
				opcionI(sc);
				break;
			case 10: // NO terminado
				opcionJ(sc);
				break;
				// validacion
			default:
				System.out.println("Introduce un número del 1 al 10.");
				break;
			}
		}
		while (opcion != 10);
		sc.close();
	}
	// opcion a
	public static void opcionA (Scanner sc) {
		sc.nextLine();
		//variables para los arrays
		int[] numerosA = new int[10];
		int[] numerosB = new int[10];
		int guardar;
		//pediremos por pantalla 10 numeros
		for (int contador=0; contador<numerosA.length;contador++) {
			System.out.println("Dime 1 numero, entre 10 y 500");
			guardar = sc.nextInt();
			//bucle de validacion entre 10-500
			while (guardar > 500 || guardar < 10){
				System.out.println("Es incorrecto. Dime otro numero");
				guardar = sc.nextInt();	
			}
			numerosA[contador] = guardar;
		}
		// usuario mete su nombre
		String nombre;
		sc.nextLine();
		System.out.println("Dime tu nombre");
		nombre = sc.nextLine();
		// el doble del arrayA que hemos llamado arrayB
		int contadorB =0;
		for (int numero : numerosA) {
			numerosB[contadorB] = numero*2;
			contadorB++;	
		}
		//mostrar los dos arrays y el nombre en mayus
		System.out.println("Usuario: " + nombre.toUpperCase());
		//arrayA
		System.out.println("Array A: ");
		for (int num : numerosA) {
			System.out.print(num + " ");
		}
		System.out.println();
		//arrayB
		System.out.println("Array B: ");
		for (int numDoble : numerosB) {
			System.out.println(numDoble + " ");
		}
	}
	// opcion b
	public static void opcionB (Scanner sc) {
		sc.nextLine();
		// variables positivos y suma
		int cantidadPositivos = 0;
		int sumaPositivos = 0;
		// variable guardar
		int numero;
		// variable para continuar
		String respuesta = "s";
		// introducir los numeros
		do {
			// pedir un número
			System.out.println("Introduce un número:");
			numero = sc.nextInt();
			sc.nextLine();
			// validacion
			if (numero > 0) {
				cantidadPositivos++;
				sumaPositivos = sumaPositivos + numero;
				// mostrar asteriscos
				for (int i = 0; i < numero; i++) {
					System.out.print("*");
				}
				System.out.println();
			}
			else if (numero < 0)
			{
				// negativo
				System.out.println("?");
			}
			// continuar
			System.out.println("¿Quieres introducir otro número? (s/n)");
			respuesta = sc.nextLine();
			// validacion
			while (!respuesta.equalsIgnoreCase("s") && !respuesta.equalsIgnoreCase("n")) {
				System.out.println("Respuesta incorrecta. Introduce s o n:");
				respuesta = sc.nextLine();
			}
		}
		// respuesta sin contar mayus ni minus
		while (respuesta.equalsIgnoreCase("s"));
		// cantidad positivos
		System.out.println("Cantidad de números positivos: " + cantidadPositivos);
		// media
		if (cantidadPositivos > 0) {
			double media = sumaPositivos / (double) cantidadPositivos;
			System.out.println("La media de los positivos es: " + media);
		} else {
			System.out.println("No has introducido ningún número positivo.");
		}
	}
	// opcion c
	public static void opcionC (Scanner sc) {
		sc.nextLine();
		int[] numeros = new int[10];
		int guardar;
		// pedimos 10 numeros del 1-10
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Dime un número (entre 1 y 10) para la posición " + (i + 1) + ":");
			guardar = sc.nextInt();
			//bucle de validacion
			while (guardar < 1 || guardar > 10) {
				System.out.println("Incorrecto. El número debe estar entre 1 y 10. Prueba otra vez:");
				guardar = sc.nextInt();
			}
			numeros[i] = guardar;
		}
		// mostrar numeros unicos
		System.out.println("Números introducidos (sin repetir):");
		//para comprobar que el numero esta ya o no
		for (int i = 0; i < numeros.length; i++) {
			boolean esta = false;
			for (int j = 0; j < i; j++) {
				if (numeros[i] == numeros[j]) {
					esta = true;
					break;
				}
			}
			//para mostrar los numeros unicos
			if (!esta) {
				System.out.println(numeros[i] + " ");
			}
		}
	}
	// opcion d
	public static void opcionD (Scanner sc) {
		String frase="";
		String letra="";
		boolean continuar = true;
		sc.nextLine();
		// escribir y guadar la frase
		System.out.println("Escribe una frase: ");
		frase = sc.nextLine();
		// entra al bucle para validar solo 1 letra
		while (continuar==true) {
			System.out.println("Introduce una letra en minúscula: ");
			letra = sc.nextLine();
			// para saber el tamaño y si es minus
			if (letra.length()==1) {
				if (letra.charAt(0)>= 97 && letra.charAt(0)<=122) {
					continuar = false;
				}
			}
		}
		char letraChar = letra.charAt(0);
		// guardar el char y comparar
		for (int i = 0; i < frase.length(); i++) {
			char caracterActual = frase.charAt(i);
			if (caracterActual == letraChar) {
				System.out.print(Character.toUpperCase(caracterActual));
			} else {
				System.out.print(caracterActual);
			}
		}
		System.out.println();
	}
	// opcion e
	public static void opcionE (Scanner sc) {
		sc.nextLine();
		String nombreapellido = "";
		char inicialApellido = ' ';
		System.out.println("Introduce tu nombre y apellido: ");
		nombreapellido = sc.nextLine();
		char inicialNombre = nombreapellido.charAt(0);
		// buscar las iniciales
		for (int i = 0; i <nombreapellido.length(); i++) {
			// espacio en blanco es 32
			if ( nombreapellido.charAt(i) ==32) {
				inicialApellido = nombreapellido.charAt(i + 1);
				break;
			}
		}
		// mostrar el saludo y las iniciales
		System.out.println("Hola " + Character.toUpperCase(inicialNombre) + "." + Character.toUpperCase(inicialApellido) + ".");
	}
	// opcion f
	public static void opcionF (Scanner sc) {
		sc.nextLine();
		String frase = "";
		int palabras = 1;
		System.out.println("Introduce una frase: ");
		frase = sc.nextLine();
		// revisar lo que no sea espacio
		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) !=32) {
				System.out.print(frase.charAt(i));
			}
			// revisar lo que sea espacio
			if (frase.charAt(i) ==32) {
				palabras = palabras+1;
			}
		}
		System.out.println();
		System.out.println("Leidas " + palabras + "palrabas");
	}
	// opcion g
	public static void opcionG (Scanner sc) {
		sc.nextLine();
	}
	// opcion i
	public static void opcionI (Scanner sc) {
		sc.nextLine();
	}
	// opcion j
	public static void opcionJ (Scanner sc) {
		sc.nextLine();
	}
	// opcion h
	public static void opcionH (Scanner sc) {
		sc.nextLine();
		//pedimos el nombre
		String nombre;
		System.out.println("Introduce tu nombre:");
		nombre = sc.nextLine();
		// 4 numeros random
		Random numero = new Random();
		// entre 0 y 100
		int num1 = numero.nextInt(101);
		// entre 1 y 50
		int num2 = numero.nextInt(50) + 1;
		// entre 10 y 80
		int num3 = numero.nextInt(71) + 10;
		// entre -50 y 50
		int num4 = numero.nextInt(101) - 50;
		// mostrar los numeros
		System.out.println("Primero es: " + num1);
		System.out.println("Segundo es: " + num2);
		System.out.println("Tercer es: " + num3);
		System.out.println("Cuarto es: " + num4);
		// guarda numeros
		int[] listaNumeros = new int[4];
		listaNumeros[0] = num1;
		listaNumeros[1] = num2;
		listaNumeros[2] = num3;
		listaNumeros[3] = num4;
		//falta ordenar los numeros y hacerlo bien
	}
}


