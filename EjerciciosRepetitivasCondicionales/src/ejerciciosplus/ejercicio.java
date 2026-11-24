package ejerciciosplus;
import java.util.Scanner;
public class ejercicio {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
       String nombre;
       int edad;
       int horas;
       double presupuesto;
       String contenido;
       boolean compartir;
       System.out.println("Introduce tu nombre:");
       nombre = teclado.nextLine();
       System.out.println("Introduce tu edad:");
       edad = teclado.nextInt();
       System.out.println("¿Cuántas horas utilizas la plataforma a la semana?");
       horas = teclado.nextInt();
       System.out.println("¿Cuál es tu presupuesto máximo mensual?");
       presupuesto = teclado.nextDouble();
       teclado.nextLine();
       System.out.println("¿Cuál es tu contenido favorito entre series, peliculas y anime?");
       contenido = teclado.nextLine();
       System.out.println("¿Quieres compartir la cuenta? (true / false)");
       compartir = teclado.nextBoolean();
       if (edad < 18 && presupuesto < 10) {
           System.out.println(nombre + ", te recomendamos el Plan Básico");
       } else if (compartir && presupuesto >= 10) {
           System.out.println(nombre + ", te recomendamos el Plan Familiar");
       } else if (horas >= 20 && (contenido.equalsIgnoreCase("series") || contenido.equalsIgnoreCase("anime"))) {
           System.out.println(nombre + ", te recomendamos el Plan Premium");
       } else if (presupuesto >= 15 || horas >= 30) {
           System.out.println(nombre + ", te recomendamos el Plan Premium");
       } else {
           System.out.println(nombre + ", te recomendamos el Plan Básico");
       }
       teclado.close();
   }
}
