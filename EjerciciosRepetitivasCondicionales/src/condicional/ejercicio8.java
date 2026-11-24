package condicional;

public class ejercicio8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeros10=1;
		boolean salir=false;
		
		while (numeros10 <= 10) {
				if(numeros10%2 == 1)
					System.out.println("La salida es impar");
					System.out.println(numeros10);
					numeros10=numeros10+1;
				if (numeros10==10)
					salir=true;
			numeros10++;

		}
	}
}

