package notaejercicio2;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);

		// alumno prueba
		Alumno alumno1 = new Alumno (1, "Pepe");

		System.out.println("¿Que notas tienes en la primera evaluacion?");
		double nota1 = Double.parseDouble(teclado.nextLine());

		System.out.println("¿Que notas tienes en la segunda evaluacion?");
		double nota2 = Double.parseDouble(teclado.nextLine());

		System.out.println("¿Que notas tienes en la tercera evaluacion?");
		double nota3 = Double.parseDouble(teclado.nextLine());

		alumno1.ponNota(nota1, nota2, nota3);

		System.out.println(alumno1.muestraAlumno());

		//alumno mano
		System.out.println("¿Como se llama el alumno?");
		String nombre = teclado.nextLine();
		alumno1.setNombre(nombre);

		System.out.println("¿Que notas tienes en la primera evaluacion?");
		nota1 =Double.parseDouble(teclado.nextLine());
		
		System.out.println("¿Que notas tienes en la segunda evaluacion?");
		nota2 = Double.parseDouble(teclado.nextLine());

		System.out.println("¿Que notas tienes en la tercera evaluacion?");
		nota3 =Double.parseDouble(teclado.nextLine());
		
		alumno1.ponNota(nota1, nota2, nota3);
		System.out.println(alumno1.muestraAlumno());

		teclado.close();

	}

}
