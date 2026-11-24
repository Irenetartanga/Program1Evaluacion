package principal;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mesNumero = 0;
		String mes = "enero";
		
		switch (mes) {
			case "enero":
				mesNumero = 1;
				break;
			case "febrero":
				mesNumero = 2;
				break;
			default:
				mesNumero = 0;
				break;
		}
		System.out.println("El mes de " + mes + " se corresponde con el numero " + mesNumero);
	}

}
