package repeticion;
import java.util.Scanner;
public class Ejercicio33{
   public static void main(String[] args) {
       // TODO Auto-generated method stub
   	Scanner teclado = new Scanner(System.in);
   		float nota;
        float suma = 0;
        float media;
        float notaAlta = 0;
        float notaBaja = 10;
        int contador = 0;
        int aprobados = 0;
        int suspensos = 0;
        System.out.println("Inserta nota " + (contador + 1) + ":");
        nota = teclado.nextFloat();
        while (nota != -1) {
            contador++;
            suma = suma + nota;
            if (nota > notaAlta) {
                notaAlta = nota;
            }
            if (nota < notaBaja) {
                notaBaja = nota;
            }
            if (nota >= 5) {
                aprobados++;
            } else {
                suspensos++;
            }
            System.out.println("Inserta nota " + (contador + 1) + ":");
            nota = teclado.nextFloat();
        }
        media = suma / contador;
        System.out.println("Total notas: " + contador);
        System.out.println("Media obtenida: " + media);
        System.out.println("La nota más alta: " + notaAlta);
        System.out.println("La nota más baja: " + notaBaja);
        System.out.println("Aprobadas: " + aprobados);
        System.out.println("Suspendidas: " + suspensos);
        teclado.close();
    }
}
