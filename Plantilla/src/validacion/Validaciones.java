package validacion;

public class Validaciones {
	// Comprobar que un número no sea negativo
	int numero = teclado.nextInt();

	while (numero < 0) {
		System.out.println("No puede ser negativo.");
		numero = teclado.nextInt();
	}

	// Comprobar que un número sea mayor que cero
	while (numero <= 0) {
		System.out.println("Debe ser mayor que 0.");
		numero = teclado.nextInt();
	}

	// Comprobar que esté dentro de un rango
	while (numero < 1 || numero > 10) {
		System.out.println("Introduce un número entre 1 y 10.");
		numero = teclado.nextInt();
	}

	// Comprobar que no supere el tamaño del array
	if (contador >= elementos.length) {
		System.out.println("No hay espacio.");
	} else {
		// Añadir elemento.
	}

	// Comprobar que el array no esté vacío
	if (contador == 0) {
		System.out.println("No hay elementos.");
	} else {
		// Continuar.
	}

	// Comprobar que una posición del array no sea null
	if (elementos[i] != null) {
		// La posición contiene un elemento.
	}

	// Comprobar si un número es positivo o negativo
	if (numero > 0) {
		System.out.println("Positivo");
	} else if (numero < 0) {
		System.out.println("Negativo");
	} else {
		System.out.println("Es cero");
	}

	// Preguntar si quiere continuar (S/N)
	System.out.println("¿Quieres continuar? (S/N)");
	String respuesta = teclado.nextLine();

	while (!respuesta.equalsIgnoreCase("S") &&
			!respuesta.equalsIgnoreCase("N")) {

		System.out.println("Responde S o N.");
		respuesta = teclado.nextLine();
	}

	// Recorrer un array completo
	for (int i = 0; i < elementos.length; i++) {
		System.out.println(elementos[i]);
	}

	// Trabajar con arrays de objetos
	Producto[] productos = new Producto[50];
	int contador = 0;

	// Eliminar un objeto desplazando los siguientes
	for (int j = i; j < contador - 1; j++) {
		productos[j] = productos[j + 1];
	}

	productos[contador - 1] = null;

	contador--;

}

