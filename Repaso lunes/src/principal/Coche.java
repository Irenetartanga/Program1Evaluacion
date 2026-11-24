package principal;

public class Coche {
	private String color;
	private String marca;

	
	public String getColor() {
		return color;
	}

	public Coche() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Coche [color=" + color + ", marca=" + marca + "]";
	}

	public Coche(String color) {
		super();
		this.color = color;
	}

	public Coche(String color, String marca) {
		super();
		this.color = color;
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
