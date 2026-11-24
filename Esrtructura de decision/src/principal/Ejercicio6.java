package principal;
import java.util.Scanner;
public class Ejercicio6 {
   public static void main(String[] args) {
       // TODO Auto-generated method stub
       Scanner teclado = new Scanner(System.in);
       float nota;
       System.out.println("Introduce una nota entre 0 y 10:");
       nota = teclado.nextFloat();
       if (nota < 5)
           System.out.println("SUSPENSO");
       if (nota >= 5 && nota < 7)
           System.out.println("APROBADO");
       if (nota >= 7 && nota < 9)
           System.out.println("NOTABLE");
       if (nota >= 9)
           System.out.println("SOBRESALIENTE");
       teclado.close();
   }
}
