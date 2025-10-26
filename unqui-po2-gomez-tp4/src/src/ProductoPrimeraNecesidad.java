package src;

public class ProductoPrimeraNecesidad extends Producto{

	private double descuento;
	
	public ProductoPrimeraNecesidad(String nombre, double precio, boolean b, double descuento) {
		super(nombre, precio, b);
		this.descuento = descuento;
	}
	
	public double getPrecio() {
		return super.getPrecio() * 0.9;
	}
	
	public double getPrecioFinal() {
		double precioFinal = getPrecio() * (descuento / 100.0);
		precioFinal = Math.round(precioFinal * 100.0) / 100.0;
	    return precioFinal;
	}
}
