package principal;
import java.util.Scanner;
public class Principal1 {

	public static void main (String[] args) {
		Coche cocheFinde= new Coche ("negro", "BMW");
		Coche cocheSemana= new Coche ("blanco", "Hyundai");

		Coche cocheVacaciones;

		System.out.println(cocheFinde.toString());
		cocheSemana.setColor("rojo");
		System.out.println(cocheSemana.getColor());


	}
}
