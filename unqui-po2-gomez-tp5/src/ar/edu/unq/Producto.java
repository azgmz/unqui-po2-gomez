package ar.edu.unq;

public abstract class Producto {

	private int stock;
	private double precioFinal;
	
	public Producto(int stock, double precioFinal) {
		this.stock = stock;
		this.precioFinal = precioFinal;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public double getPrecioFinal() {
		return precioFinal;
	}

	public void setPrecioFinal(double precioFinal) {
		this.precioFinal = precioFinal;
	}
	
}
