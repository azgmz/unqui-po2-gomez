package ar.edu.unq.caja;

public class ProductoCooperativa extends Producto {

	public ProductoCooperativa(int stock, double precioBase) {
		super(stock, precioBase);
	}

	@Override
	public double getPrecioFinal() {
		return super.getPrecioFinal() - (super.getPrecioFinal() * 0.10);
	}
	
}
