package ejercicio2;

public class Cuenta {
	private String nombreTitular;
	private double cantidad;

	public Cuenta(String nombreTitular, double cantidad) {
		super();
		this.nombreTitular = nombreTitular;
		this.cantidad = cantidad;
	}
	public String getNombreTitular() {
		return nombreTitular;
	}
	public void setNombreTitular(String nombreTitular) {
		this.nombreTitular = nombreTitular;
	}
	public double getCantidad() {
		return cantidad;
	}
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public Cuenta() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Cuenta [nombreTitular=" + nombreTitular + ", cantidad=" + cantidad + "]";
	}
	public void ingresar (double cantidad) {
		if (cantidad>0) {
			this.cantidad = this.cantidad+cantidad;
		}
	}
	public void retirar (double cantidad) {
		if (cantidad>0) {
			this.cantidad = this.cantidad-cantidad;
			if (this.cantidad>=cantidad) {
				this.cantidad = 0;
			}
		}
	}
}
