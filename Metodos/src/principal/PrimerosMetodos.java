package principal;

public class PrimerosMetodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mostrarporpantalla("Hola mundo");
		mostrarporpantalla("De nuevo Hola mundo");
		mostrarporpantallaconentero("El numero es ",1);

		int resultado = sumarenteros(1,2);
		System.out.println(resultado);

	}

	public static void mostrarporpantalla (String mensaje) {
		System.out.println(mensaje);
	}

	public static void mostrarporpantallaconentero (String mensaje, int numero) {
		System.out.println(mensaje + numero);

	}

	public static int sumarenteros (int numero1, int numero2) {
		int resultado=numero1+numero2;
		return resultado;

	}
}