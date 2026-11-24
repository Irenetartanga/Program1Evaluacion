package principal;

public class Persona {
	private String nombre;
	private int edad;
	private String DNI;
	public String getNombre() {
		return nombre;
	}

	public Persona() {
		super();
		// TODO Auto-generated constructor stub
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
	public Persona(String nombre, int edad, String dNI) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		DNI = dNI;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", DNI=" + DNI + "]";
	}

	public boolean esMayorDeEdad () {
		boolean edadMayor=false;
		if (edad>=18) {
			edadMayor=true;
		}
		return edadMayor;

	}

}


