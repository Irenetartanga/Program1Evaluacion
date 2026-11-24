package principal;

public class Localizarespaciosblanco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (frase.charAt(posicion) == ' ') { ... } // Opción A: Usando el carácter directo
		if (frase.charAt(posicion) == 32) { ... }  // Opción B: Usando su número ASCII
		// frase.charAt(posicion) -> Devuelve un tipo char en la posición indicada.
		// ' ' o 32               -> Representan exactamente lo mismo: el espacio en blanco.
		// ==                     -> Operador de comparación (devuelve true o false).

	}

}
