package EstadoReparacion;


public class Reparacion {
	private int identificador;
	public Reparacion() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Reparacion(int identificador, EstadoReparacion estado) {
		super();
		this.identificador = identificador;
		this.estado = estado;
	}
	@Override
	public String toString() {
		return "reparacion [identificador=" + identificador + ", estado=" + estado + "]";
	}
	public int getIdentificador() {
		return identificador;
	}
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	public EstadoReparacion getEstado() {
		return estado;
	}
	public void setEstado(EstadoReparacion estado) {
		this.estado = estado;
	}
	private EstadoReparacion estado;
	
}
