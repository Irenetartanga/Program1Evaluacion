package EstadoReparacion;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		Reparacion [] areparaciones= new Reparacion [3];
		areparaciones [0]= new Reparacion (1,EstadoReparacion.EN_DIAGNOSTICO);
		
		for (int contador=0; contador<areparaciones.length;contador++) {
			if (areparaciones[contador]!=null)
				System.out.println(areparaciones[contador].toString());
		}
		
		for (Reparacion unareparacion:areparaciones)
			System.out.println(unareparacion);
		
		System.out.println();
		
		teclado.close();
	}
}
