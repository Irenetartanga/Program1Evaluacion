package almacen;
import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);

		int opcion;

		Producto[] productos = new Producto[2];
		productos[0] = new Producto("patata", 3, true);
		productos[1] = new Producto("pepino", 20, true);

		int contadorarray=0; 

		do {
			// las opciones del menu para elegir
			System.out.println("1. Opción: Mostrar todos los productos");
			System.out.println("2. Opción: Modificar un producto");
			System.out.println("3. Opción: Cambiar el orden de los productos");
			System.out.println("4. Opción: Contar productos activos");
			System.out.println("5. Opción: Buscar un producto por nombre");
			System.out.println("6. Opción: Comprar unidades de un producto");
			System.out.println("7. Opción: Salir del programa");
			System.out.print("Elige una opción: ");
			opcion = teclado.nextInt();
			teclado.nextLine();

			// las diferentes opciones
			switch (opcion) {
			case 1:
				Mostrar (teclado, productos, contadorarray);
				break;
			case 2:
				Modificar (teclado, productos, contadorarray);
				break;
			case 3:
				//no se hace, no sabemos
				Cambiar (teclado, productos, contadorarray);
				break;
			case 4:
				Contar (teclado, productos, contadorarray);
				break;
			case 5:
				Buscar (teclado, productos, contadorarray);
				break;
			case 6:
				Comprar (teclado, productos, contadorarray);
				break;
			}
		}
		while (opcion != 7);
		System.out.println("Programa cerrado");
		teclado.close();
	}

	public static void Mostrar (Scanner teclado, Producto[] productos, int contadorarray) {
		for (int contador = 0; contador<productos.length;contador++) {
			System.out.println(productos[contador].mostrarProductos());
		}
	}

	public static void Modificar (Scanner teclado, Producto[] productos, int contadorarray) {
		String respuesta;
		// si no esta el articulo
		if (contadorarray>=productos.length) {
			System.out.print("No hay espacios libres.");
			return; 
		}
		System.out.print("¿Cual es el nombre del producto?");
		respuesta = teclado.nextLine();
		for (int contador = 0; contador<productos.length;contador++) {
			if (respuesta.equalsIgnoreCase(productos[contador].getNombre())) {
				System.out.println("¿Cual es el nuevo nombre del producto?");
				productos[contador].setNombre(teclado.nextLine());

				System.out.println("¿Cual es la nueva unidad del producto?");
				productos[contador].setUnidades(teclado.nextFloat());

				System.out.println("¿Esta disponible (true) o no disponible (false) el producto?");
				productos[contador].setActivo(teclado.nextBoolean());
			}
		}
	}

	//no se hace, no sabemos
	public static void Cambiar (Scanner teclado, Producto[] productos, int contadorarray) {
	}

	public static void Contar (Scanner teclado, Producto[] productos, int contadorarray) {
		int activo=0;
		for (int contador = 0; contador<productos.length;contador++) {

			if (productos[contador].isActivo()) {
				activo++;
			}
		}
		System.out.println("activos " + activo);
	}

	public static void Buscar (Scanner teclado, Producto[] productos, int contadorarray) {
		String respuesta;
		boolean encontrado=false;
		System.out.print("¿Cual es el nombre del producto?");
		respuesta = teclado.nextLine();
		for (int contador = 0; contador<productos.length;contador++) {
			if (respuesta.equalsIgnoreCase(productos[contador].getNombre())) {
				System.out.println(productos[contador].mostrarProductos());
				encontrado= true;
			}
		}
		if (encontrado==false) {
			System.out.println("No se encuentra el producto");
		}
	}

	public static void Comprar (Scanner teclado, Producto[] productos, int contadorarray) {
		String respuesta;
		boolean encontrado=false;
		float cantidad=0;
		int contador =0;
		int unidadesActuales = 0;
		System.out.print("¿Cual es el nombre del producto?");
		respuesta = teclado.nextLine();
		for (contador = 0; contador<productos.length;contador++) {
			if (respuesta.equalsIgnoreCase(productos[contador].getNombre())) {
				encontrado= true;
			}
			if (encontrado == true) {
				System.out.println("¿Que cantidad quieres comprar?");
				cantidad=teclado.nextInt();	
				productos[contador].setUnidades(unidadesActuales - cantidad);
			}
		}
		if (encontrado==false) {
			System.out.println("No se encuentra el producto");
		}
	}
}


