package dvdejercicio1;
import java.util.Scanner;
public class Principal {
	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);

		// pelicula de prueba
		DVD pelicula = new DVD ("Un final made in Hollywood", "Woody Allen", "Woody Allen y George Hamilton", "Los Oscars ganados en el pasado por…", "Comedia", 114);
		
		System.out.println(pelicula.muestraDuracion());
		System.out.println(pelicula.muestraDVDcine());
		System.out.println(pelicula.esThriller());

		// pelicula a mano
		System.out.println("¿Como se llama la pelicula?");
		String titulo = teclado.nextLine();
		pelicula.setTitulo(titulo);
		
		System.out.println("¿Como se llama el director?");
		String director = teclado.nextLine();
		pelicula.setDirector(director);

		System.out.println("¿Como se llama el actor principal?");
		String actorPrinc = teclado.nextLine();
		pelicula.setActorPrinc(actorPrinc);
		
		System.out.println("¿Como es el resumen de la pelicula?");
		String resumen = teclado.nextLine();
		pelicula.setResumen(resumen);
		
		System.out.println("¿La pelicula que genero es? Thriller, comedia, familiar, ...");
		String genero = teclado.nextLine();
		pelicula.setGenero(genero);
		
		System.out.println("¿Cual es la duracion de la pelicula?");
		int duracion = teclado.nextInt();
		pelicula.setDuracion(duracion);
		
		
		
		System.out.println(pelicula.muestraDVDcine());
		
		teclado.close();
	}
	
}