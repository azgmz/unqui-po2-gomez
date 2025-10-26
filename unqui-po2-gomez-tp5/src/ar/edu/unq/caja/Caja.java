package ar.edu.unq.caja;

import java.util.ArrayList;
import java.util.List;

public class Caja {

	private List<Producto> productosRegistrados;
	
	public Caja() {
		this.productosRegistrados = new ArrayList<Producto>();
	}

	public List<Producto> getProductosRegistrados() {
		return productosRegistrados;
	}

	public void registrarProducto(Producto producto) {
		if (producto.tieneSuficienteStock()) {
			producto.descrementarStock();
			productosRegistrados.add(producto);
		} else {
			throw new IllegalStateException("No hay stock disponible");		
		}
		
		}

	public double total() {
		double totalAPagar = 0;
		for (Producto p : productosRegistrados) {
			totalAPagar += p.getPrecioFinal();
		}
		return totalAPagar;
	}

	public boolean tieneRegistrado(Producto producto) {
		return productosRegistrados.contains(producto);
	}

	public int cantidadDeProductosRegistrados() {
		return productosRegistrados.size();
	}

	public void compraRealizada() {
		productosRegistrados = new ArrayList<Producto>();
	}

	
}
