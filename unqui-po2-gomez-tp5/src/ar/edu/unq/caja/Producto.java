package ar.edu.unq.caja;

public abstract class Producto {

	private int stock;
	private double precioBase;
	
	public Producto(int stock, double precioBase) {
		this.stock = stock;
		this.precioBase = precioBase;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public double getPrecioFinal() {
		return precioBase;
	}

	public void setPrecioFinal(double precioBase) {
		this.precioBase = precioBase;
	}

	public boolean tieneSuficienteStock() {
		return stock >= 1;
	}

	public void descrementarStock() {
		setStock(stock - 1);
	}
	
}
