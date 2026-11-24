package dvdejercicio1;

public class DVD {
	private String titulo;
	private String director;
	private String actorPrinc;
	private String resumen;
	private String genero;
	private int duracion;
	public DVD(String titulo, String director, String actorPrinc, String resumen, String genero, int duracion) {
		super();
		this.titulo = titulo;
		this.director = director;
		this.actorPrinc = actorPrinc;
		this.resumen = resumen;
		this.genero = genero;
		this.duracion = duracion;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getActorPrinc() {
		return actorPrinc;
	}
	public void setActorPrinc(String actorPrinc) {
		this.actorPrinc = actorPrinc;
	}
	public String getResumen() {
		return resumen;
	}
	public void setResumen(String resumen) {
		this.resumen = resumen;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	@Override
	public String toString() {
		return "DVD [titulo=" + titulo + ", director=" + director + ", actorPrinc=" + actorPrinc + ", resumen="
				+ resumen + ", genero=" + genero + ", duracion=" + duracion + "]";
	}

	public int muestraDuracion () {
		return duracion;

	}
	public String muestraDVDcine () {
		return titulo +  "\nDe:" + director + "\nCon: " + actorPrinc  + "\nComedia: " + duracion+ "\nResumen: "+ resumen;
	}

	public boolean esThriller () {
		String esThriller;
		if (genero.equalsIgnoreCase("esThriller")) {
			return true;
		} else {
			return false;
		}
	}

}
