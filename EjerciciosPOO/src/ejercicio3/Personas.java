package ejercicio3;

public class Personas {
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	private String nombre;
	private int edad;
	public Personas(String nombre, int edad, String dNI) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		DNI = dNI;
	}
	@Override
	public String toString() {
		return "Personas [nombre=" + nombre + ", edad=" + edad + ", DNI=" + DNI + "]";
	}
	private String DNI;

	// Comprobar si es mayor de edad
	public boolean esMayorDeEdad() {
		return edad >= 18;
	}

}
