package gestionDeExcursiones;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);

		Excursión[] excursion = new Excursión[30]; // cambiar a 30 luego
		// comprobar con un array creado
		excursion[0] = new Excursión("z", null, 3, 2, 2);

		int opcion=0;
		int contadorarray=0;

		do {
			// las opciones del menu para elegir
			System.out.println("--MENU--");
			System.out.println("1. Introducir excursion");
			System.out.println("2. Mostrar las excursiones que superen la velocidad media dada");
			System.out.println("3. Inscribir participantes en una excursion");
			System.out.println("4. Eliminar una excursion");
			System.out.println("5. Mostrar todas las excursiones");
			System.out.println("6. Salir");
			System.out.print("Elige una opción: ");
			opcion = teclado.nextInt();
			teclado.nextLine();

			// las diferentes opciones
			switch (opcion) {
			case 1:
				Introducir (teclado, excursion, contadorarray);
				break;
			case 2:
				VelocidadMedia (teclado, excursion, contadorarray);
				break;
			case 3:
				Inscribir (teclado, excursion, contadorarray);
				break;
			case 4:
				Eliminar (teclado, excursion, contadorarray);
				break;
			case 5:
				MostrarTodo (teclado, excursion, contadorarray);
				break;
			}

		}
		while (opcion != 6);
		System.out.println("Programa cerrado");
		teclado.close();

	}

	public static int Introducir (Scanner teclado, Excursión[] excursion, int contadorarray) {
		// solo introducir codigos de las excursiones

		char respuesta;
		String codigoNuevo;

		do {
			// si no esta 
			if (contadorarray==excursion.length) {
				System.out.print("No hay espacios libres.");
			}
			else {

				// para introducir
				System.out.print("Introduce el codigo de la excursion");

				codigoNuevo = teclado.nextLine();
				//	this.codigo = codigoNuevo;

				contadorarray++; 
				System.out.println("El codigo ha sido introducido ");

			}
			// añadir mas
			System.out.println("¿Quieres introducir mas excursiones? Si/s o No/n");
			respuesta = teclado.nextLine().toLowerCase().charAt(0);

		} while (respuesta== 's'); 
		return contadorarray;
	}

	public static void VelocidadMedia (Scanner teclado, Excursión[] excursion, int contadorarray) {
		String respuesta = null;
		boolean encontrado=true;

		for (int contador = 0; contador<excursion.length&&encontrado==false;contador++) {
			if (respuesta.equals(excursion[contador].obtenerVelocidadMedia())) {
				//System.out.println(excursion[contador].velocidadMedia);

			} else {
				System.out.println("No hay ninguna que supere la media");
			}

			return;
		}
		//double velocidadMedia=0;
		//velocidadMedia =  getDistanciaRecorrida / getDuracionExcursion;
		//return	velocidadMedia;

	}

	public static void Inscribir (Scanner teclado, Excursión[] excursion, int contadorarray) {
		// solo meter en numero de participantes
		String respuesta;
		boolean encontrado=true;

		// si no esta
		if (contadorarray>=excursion.length) {
			System.out.print("No hay espacios libres.");
			return; 
		}
		System.out.print("¿Cual es el codigo de la excursion?");
		respuesta = teclado.nextLine().toLowerCase();
		for (int contador = 0; contador<excursion.length&&encontrado==false;contador++) {
			if (respuesta.equalsIgnoreCase(excursion[contador].getCodigo())) {

				// inscribir es a participantes
				System.out.print("Introduce el numero de participantes: ");
				//guardar en el array de arriba
				int numeroParticipantes = teclado.nextInt();
				teclado.nextLine();
			}

			if (encontrado==false) 
			{
				System.out.println("La excursion no existe");
				encontrado=true;
			}
		} 
		return;
	}

	public static void Eliminar (Scanner teclado, Excursión[] excursion, int contadorarray) {
		String respuesta;
		char confirmar = 0;
		boolean encontrado=true;

		// si no esta
		if (contadorarray>=excursion.length) {
			System.out.print("No hay espacios libres.");
			return; 
		}
		System.out.print("¿Cual es el codigo de la excursion?");
		respuesta = teclado.nextLine().toLowerCase();
		for(int contador=0; contador<excursion.length; contador++) {
			if (encontrado==false) 
			{
				System.out.println("La excursion no existe");
				encontrado=true;
			}

			if (respuesta.equalsIgnoreCase(excursion[contador].getCodigo())) {
				System.out.println("¿Estas seguro de que quieres eliminarlo? Si/s o No/n");
				confirmar = teclado.nextLine().toLowerCase().charAt(0);

				if (confirmar== 's'); 
				excursion[contador] = null;
				System.out.println("Excursion eliminada correctamente");
				return;
			}
		} 
		return; 
	}

	public static void MostrarTodo (Scanner teclado, Excursión[] excursion, int contadorarray) {
		for(int contador=0; contador<excursion.length; contador++) {
			if (excursion[contador]!=null) {
				System.out.println(excursion[contador].toString());
			}
		}
	}
}


