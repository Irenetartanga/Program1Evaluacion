package notaejercicio2;

public class Alumno {

	private int numeroDeMatricula;
	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	private double nota1;
	private double nota2;	
	private double nota3;

	public Alumno(int numeroDeMatricula, String nombre) {
		super();
		this.numeroDeMatricula = numeroDeMatricula;
		this.nombre = nombre;
	}

	public void ponNota (double nota1, double nota2, double nota3) {
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;

	}
	public double dameMedia () { 
		return (nota1+nota2+nota3)/3;
	}
	public String muestraAlumno () { 
		return "Alumno [numeroDeMatricula=" + numeroDeMatricula + ", nombre=" + nombre + ", dameMedia()=" + dameMedia()
		+ "]";
	}

}
