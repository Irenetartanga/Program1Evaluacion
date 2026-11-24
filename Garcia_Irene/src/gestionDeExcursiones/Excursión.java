package gestionDeExcursiones;

public class Excursión {
	String codigo;
	
	@Override
	public String toString() {
		return "Excursión [codigo=" + codigo + ", Destino=" + Destino + ", numeroParticipantes=" + numeroParticipantes
				+ ", distanciaRecorrida=" + distanciaRecorrida + ", duracionExcursion=" + duracionExcursion + "]";
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getNumeroParticipantes() {
		return numeroParticipantes;
	}
	public void setNumeroParticipantes(int numeroParticipantes) {
		this.numeroParticipantes = numeroParticipantes;
	}
	public int getDistanciaRecorrida() {
		return distanciaRecorrida;
	}
	public void setDistanciaRecorrida(int distanciaRecorrida) {
		this.distanciaRecorrida = distanciaRecorrida;
	}
	public int getDuracionExcursion() {
		return duracionExcursion;
	}
	public void setDuracionExcursion(int duracionExcursion) {
		this.duracionExcursion = duracionExcursion;
	}
	public Excursión(String codigo, String destino, int numeroParticipantes, int distanciaRecorrida,
			int duracionExcursion) {
		super();
		this.codigo = codigo;
		this.numeroParticipantes = numeroParticipantes;
		this.distanciaRecorrida = distanciaRecorrida;
		this.duracionExcursion = duracionExcursion;
	}
	String Destino;
	public Excursión(String destino) {
		super();
		Destino = destino;
	}
	public String getDestino() {
		return Destino;
	}
	public void setDestino(String destino) {
		Destino = destino;
	}
	int numeroParticipantes=0;
	int distanciaRecorrida=0;
	int duracionExcursion=0;

	public boolean grupoCompleto () {
		if (numeroParticipantes  == 25) {
			System.out.println("Excursion ha alcanzado el numero maximo de participantes permitido");
			return true;
		} else
			return false;
	}
	
	public double obtenerVelocidadMedia () {
		double velocidadMedia=0;
		velocidadMedia =  distanciaRecorrida / duracionExcursion;
		return	velocidadMedia;
	}
}
