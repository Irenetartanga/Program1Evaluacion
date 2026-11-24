package principal;
import menu.Menu;
import operaciones.Operaciones;
public class Calculadora{
    public static void main(String[] args) {   
        int resultado = 0;
        String operacion = "";
        int[] operandos = new int [2];
        
        Menu menu = new Menu();
        Operaciones operaciones = new Operaciones();
        
        do{
            operandos = menu.pedirNumeros();
            operacion = menu.menuOpciones();
           
            operacionAyuda(operacion, operandos, operaciones);
        }   while (menu.repetir());
    }

	private static void operacionAyuda(String operacion, int[] operandos, Operaciones operaciones) {
		int resultado;
		if (operacion.equalsIgnoreCase("+")){
		    resultado = operaciones.sumar(operandos[0], operandos[1]);
		    System.out.println ("Resultado: " + resultado);
		} else if (operacion.equalsIgnoreCase("-")){
		    resultado = operaciones.restar(operandos[0], operandos[1]);
		    System.out.println ("Resultado: " + resultado);
		} else if (operacion.equalsIgnoreCase("*")){
		    resultado = operaciones.multiplicar(operandos[0], operandos[1]);
		    System.out.println ("Resultado: " + resultado);
		} else if (operacion.equalsIgnoreCase("/")){
		    resultado = operaciones.dividir(operandos[0], operandos[1]);
		    System.out.println ("Resultado: " + resultado);
		} else if (operacion.equalsIgnoreCase("%")){
		    resultado = operaciones.resto(operandos[0], operandos[1]);
		    System.out.println ("Resultado: " + resultado);
		} else {
		    System.out.println ("Operaci�n no v�lida");
		}
	}
}