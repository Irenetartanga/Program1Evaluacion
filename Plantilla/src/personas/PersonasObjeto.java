package personas;

public class PersonasObjeto {
	private String nombre;
	private String dni;
	private int edad;
	private boolean activo;

	// Constructor: permite crear una persona con sus datos.
	public PersonasObjeto(String nombre, String dni, int edad, boolean activo) {
		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;
		this.activo = activo;
	}

	// GETTERS: consultar los datos.
	public String getNombre() {
		return nombre;
	}

	public String getDni() {
		return dni;
	}

	public int getEdad() {
		return edad;
	}

	public boolean isActivo() {
		return activo;
	}

	// SETTERS: modificar los datos.
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	// Comprobar si es mayor de edad.
	public boolean esMayorEdad() {

		if (edad >= 18) {
			return true;
		} else {
			return false;
		}
	}

	// Mostrar todos los datos.
	public String mostrarPersona() {

		return "Nombre: " + nombre +
				" | DNI: " + dni +
				" | Edad: " + edad +
				" | Activo: " + activo;
	}
}
