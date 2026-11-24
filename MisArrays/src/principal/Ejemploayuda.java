package principal;

public class Ejemploayuda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numeros = new int[3];
		int numero = 2;

		for (int contador=0; contador <numeros.length;contador++){
			numeros [contador] = numero;
			numero = numero-1;
			System.out.println(numeros [contador]);
		}
	}
}
