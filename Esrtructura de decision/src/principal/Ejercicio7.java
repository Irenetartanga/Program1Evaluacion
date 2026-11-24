package principal;
import java.util.Scanner;
public class Ejercicio7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
       float precio;
       int cantidad;
       float descuento = 0;
       float precioFinal;
       System.out.println("Introduce el precio de una unidad:");
       precio = teclado.nextFloat();
       System.out.println("Introduce la cantidad de unidades:");
       cantidad = teclado.nextInt();
       if (cantidad > 100)
           descuento = 40;
       if (cantidad >= 25 && cantidad <= 100)
           descuento = 20;
       if (cantidad >= 10 && cantidad < 24)
           descuento = 10;
       if (cantidad < 10)
           descuento = 0;
       precioFinal = precio * cantidad - (precio * cantidad * descuento / 100);
       System.out.println("Descuento: " + descuento + "%");
       System.out.println("Precio final: " + precioFinal + " €");
       teclado.close();
	}
}
