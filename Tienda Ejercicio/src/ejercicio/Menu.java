package ejercicio;
import java.util.Scanner;
public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);

		int opcion;

		String[] articulo = new String[4];
		double [] precio = new double[4];
		int contadorarray=0; 

		do {
			// las opciones del menu para elegir
			System.out.println("1. Opción: Añadir articulo y precios");
			System.out.println("2. Opción: Mostrar productos de la tienda");
			System.out.println("3. Opción: Obtener el precio de un producto");
			System.out.println("4. Opción: Obtener el IVA de un producto");
			System.out.println("5. Opción: Modificar el precio de un producto");
			System.out.println("6. Opción: Eliminar un producto");
			System.out.println("7. Opción: Salir");
			System.out.print("Elige una opción: ");
			opcion = teclado.nextInt();
			teclado.nextLine();

			// las diferentes opciones
			switch (opcion) {
			case 1:
				contadorarray=añadir (teclado, articulo, precio, contadorarray);
				break;

			case 2:
				mostrar (teclado, articulo,precio, contadorarray);
				break;

			case 3:
				precio (teclado, articulo,precio, contadorarray);
				break;

			case 4:
				iva (teclado, articulo,precio, contadorarray);
				break;

			case 5:
				modificar (teclado, articulo,precio, contadorarray);
				break;

			case 6:
				eliminar (teclado, articulo,precio, contadorarray);
				break;

			}
		}
		while (opcion != 7);
		System.out.println("Programa cerrado");
		teclado.close();

	}

	// añadir articulos y precios
	public static int añadir (Scanner teclado, String[] articulo,double[] precio, int contadorarray) {
		char respuesta;
		String articulonuevo;
		double precionuevo;

		do {
			// si no esta el articulo
			if (contadorarray==articulo.length) {
				System.out.print("No hay espacios libres.");
				//return contadorarray; 

			}
			else {

				// para introducir el precio 
				System.out.print("Introduce el nombre del articulo: ");
				//guardar en el array de arriba de articulo
				articulo [contadorarray] = teclado.nextLine();
				//articulonuevo = teclado.nextLine();

				System.out.print("Introduce el precio del articulo: ");
				//guardar en el array de arriba de 
				precio [contadorarray] = teclado.nextDouble();
				teclado.nextLine();

				// guardar en el array de arriba
				//articulo [contadorarray] = articulonuevo;
				//precio [contadorarray] = precionuevo;

				contadorarray++; 
				System.out.println("El articulo ha sido introducido ");
			}
			// añadir mas articulos
			System.out.println("¿Quieres introducir mas articulos? Si/s o No/n");
			respuesta = teclado.nextLine().toLowerCase().charAt(0);

		} while (respuesta== 's'); 
		return contadorarray;


	}

	// Mostrar productos de la tienda
	public static void mostrar (Scanner teclado, String[] articulo,double[] precio, int contadorarray) {

		for (int contador = 0; contador<contadorarray;contador++) {
			if (contadorarray==0) {
				System.out.print("No hay articulos.");
				//return contadorarray; 

			}else {
				System.out.println("El precio del articulo " + articulo[contador] + " es " + precio[contador]);

			}
		}
	}

	// Obtener el precio de un producto
	public static void precio (Scanner teclado, String[] articulo,double[] precio, int contadorarray) {
		String respuesta;

		// si no esta el articulo
		if (contadorarray>=articulo.length) {
			System.out.print("No hay espacios libres.");
			return; 
		}
		System.out.print("¿Cual es el nombre del articulo?");
		respuesta = teclado.nextLine().toLowerCase();
		boolean encontrado=false;
		for (int contador = 0; contador<contadorarray&&encontrado==false;contador++)
		{
			if (respuesta.equalsIgnoreCase(articulo[contador])) 
			{
				System.out.println("El precio es " + precio [contador]);
				encontrado=true;
			}
		}
		if (encontrado==false) 
		{
			System.out.println("El articulo no existe");
		}
	}
	//Obtener el iva de un producto
	public static void iva (Scanner teclado, String[] articulo,double[] precio, int contadorarray) {
		String respuesta;

		// si no esta el articulo
		if (contadorarray>=articulo.length) {
			System.out.print("No hay espacios libres.");
			return; 
		}
		System.out.print("¿Cual es el nombre del articulo?");
		respuesta = teclado.nextLine().toLowerCase();
		boolean encontrado=false;
		for (int contador = 0; contador<articulo.length&&encontrado==false;contador++)
		{
			if (respuesta.equalsIgnoreCase(articulo[contador])) 
			{
				System.out.println("El precio es " + precio [contador]*0.21);
				encontrado=true;
			}
		}
		if (encontrado==false) 
		{
			System.out.println("El articulo no existe");
		}
	}

	//Modificar el precio de un producto
	//no esta bien, solo deja escribir el producto no modificarlo
	public static void modificar (Scanner teclado, String[] articulo,double[] precio, int contadorarray) {
		String respuesta;
		int precioNuevo;

		// si no esta el articulo
		if (contadorarray>=articulo.length) {
			System.out.print("No hay espacios libres.");
			return; 
		}
		System.out.print("¿Cual es el nombre del articulo?");
		respuesta = teclado.nextLine().toLowerCase();
		for (int contador = 0; contador<articulo.length;contador++) {
			if (respuesta==articulo[contador]) {

				System.out.print("Escribe el nuevo precio del articulo");
				precioNuevo = teclado.nextInt();
				precio[contador] = precioNuevo;

				System.out.print("El precio nuevo es " +precioNuevo);

			}
		}
	}
	//Eliminar un producto
	// me sale siempre el articulo no existe + producto eliminado correctamente
	// tengo que mover los null
	public static int eliminar (Scanner teclado, String[] articulo,double[] precio, int contadorarray) {
		String respuesta;
		char confirmar = 0;
		boolean encontrado=false;

		// si no esta el articulo
		if (contadorarray>=articulo.length) {
			System.out.print("No hay espacios libres.");
			return contadorarray; 
		}
		System.out.print("¿Cual es el nombre del articulo que quieres eliminar?");
		respuesta = teclado.nextLine().toLowerCase();
		for (int contador = 0; contador<articulo.length&&encontrado==false;contador++) {
			if (encontrado==false) 
			{
				System.out.println("El articulo no existe");
				encontrado=true;
			}

			if (respuesta==articulo[contador]) {
				System.out.println("¿Estas seguro de que quieres eliminarlo? Si/s o No/n");
				confirmar = teclado.nextLine().toLowerCase().charAt(0);

				while (confirmar== 's'); 
				articulo[contador] = null;
				System.out.println("Producto eliminado correctamente");
			}

		} 
		return contadorarray; 

	}


}
