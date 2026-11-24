package principal2;
import java.util.Scanner;
public class ManejoTecladoAmpliado {
	

	    public static void main(String[] args) {

	        Scanner teclado = new Scanner(System.in);

	       // String
	        System.out.print("Introduce tu nombre: ");
	        String nombre = teclado.nextLine();

	        // char
	        System.out.print("Introduce una letra: ");
	        char letra = teclado.nextLine().charAt(0);

	        // int
	        System.out.print("Introduce tu edad: ");
	        int edad = Integer.parseInt(teclado.nextLine());

	        // double
	        System.out.print("Introduce tu altura: ");
	        double altura = Double.parseDouble(teclado.nextLine());

	        // boolean
	        System.out.print("¿Eres estudiante? (true/false): ");
	        boolean estudiante = Boolean.parseBoolean(teclado.nextLine());

	        // Otro String
	        System.out.print("Introduce tu ciudad: ");
	        String ciudad = teclado.nextLine();

	        System.out.println();
	        System.out.println("DATOS INTRODUCIDOS");
	        System.out.println("------------------");
	        System.out.println("Nombre: " + nombre);
	        System.out.println("Letra: " + letra);
	        System.out.println("Edad: " + edad);
	        System.out.println("Altura: " + altura);
	        System.out.println("Estudiante: " + estudiante);
	        System.out.println("Ciudad: " + ciudad);

	        // Comparación de Strings
	        if (ciudad.equals("Bilbao")) 
	            System.out.println("Vives en Bilbao");
	        
	        if (ciudad.equalsIgnoreCase("Bilbao")){
	            System.out.println("Vives en Bilbao");
	        }
	        
	        if (estudiante==false)
	        	System.out.println("Pues vaya!, no eres estudiante!");
	        teclado.close();
	    }
	
}