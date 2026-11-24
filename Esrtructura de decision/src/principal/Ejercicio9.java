package principal;
import java.util.Scanner;
public class Ejercicio9 {

public static void main(String[] args) {
	// TODO Auto-generated method stub

	Scanner teclado= new Scanner(System.in); //Para hacer cosas con el teclado

    System.out.print("Introduce tu sueldo bruto mensual: ");
    double sueldo = Double.parseDouble(teclado.nextLine());	
    
    System.out.print("Introduce tu estado civil: ");
    String estadocivil = teclado.nextLine();

    if (estadocivil.equalsIgnoreCase("casado"))
        System.out.println(sueldo/8*100);
	
    if (estadocivil.equalsIgnoreCase("soltero"))
        System.out.println(sueldo/13*100);
    
    if (estadocivil.equalsIgnoreCase("viudo"))
        System.out.println(sueldo/10*100);
	
    if (estadocivil.equalsIgnoreCase("otro"))
        System.out.println(sueldo/11*100);
    
    
    
    teclado.close();
	}
}
