package ar.edu.unq;

public abstract class Cultivo {
	private double precioUnitario;
	
	public Cultivo(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
}
