package almacen;

public class Producto {
	private String nombre;
	public Producto(String nombre, float unidades, boolean activo) {
		super();
		this.nombre = nombre;
		this.unidades = unidades;
		this.activo = activo;
	}
	@Override
	public String toString() {
		return "Inventario [nombre=" + nombre + ", unidades=" + unidades + ", activo=" + activo + "]";
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getUnidades() {
		return unidades;
	}
	public void setUnidades(float unidades) {
		this.unidades = unidades;
	}
	public boolean isActivo() {
		return activo;
	}
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	private float unidades;
	private boolean activo;

	public String mostrarProductos () {
		if (activo  == false) {
			return nombre + ", " + unidades + ", " + "No disponible";
		} else
			return nombre + ", " + unidades + ", " + "Disponible";
	}
}

