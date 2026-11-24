package ejercicios;

public class Array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arrayA= {33,4};
		int [] arrayB= {5,7,66};
		int [] arrayC = new int [5];

		for (int contador=0; contador<2; contador++) {
			arrayC [contador] = arrayA [contador];
			System.out.println("contador vale: " + contador + " y arrayC [contador] vale: " + arrayC [contador]);

		}
	}
}
