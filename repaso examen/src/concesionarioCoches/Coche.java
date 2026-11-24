package concesionarioCoches;

public class Coche {
	String matricula;
	@Override
	public String toString() {
		return "Coche [matricula=" + matricula + ", marca=" + marca + ", color=" + color + ", caballos=" + caballos
				+ ", precio=" + precio + "]";
	}
	public Coche(String matricula, String marca, String color, int caballos, int precio) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.color = color;
		this.caballos = caballos;
		this.precio = precio;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getCaballos() {
		return caballos;
	}
	public void setCaballos(int caballos) {
		this.caballos = caballos;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	String marca;
	String color;
	int caballos=0;
	int precio=0;
	
}
