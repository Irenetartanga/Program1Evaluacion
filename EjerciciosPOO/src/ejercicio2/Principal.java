package ejercicio2;
import java.util.Scanner;
public class Principal {
	public static void main(String[]args) {
		// TODO Auto-generated method stub
		
		Cuenta cuentaIrene = new Cuenta ("Irene", 200);
		//ingresar
		cuentaIrene.ingresar(-200);

		System.out.println(cuentaIrene.toString());
		System.out.println(cuentaIrene.getCantidad());

		cuentaIrene.ingresar(500);
		System.out.println(cuentaIrene);

		//retirar
		cuentaIrene.retirar(500);

		System.out.println(cuentaIrene.toString());
		System.out.println(cuentaIrene.getCantidad());

		cuentaIrene.retirar(-200);
		System.out.println(cuentaIrene);
		
	}
}

