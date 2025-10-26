package ar.edu.unq;

public interface Agencia {
	public void registrarPago(Factura factura);
	public boolean tieneFacturaDe(Factura factura);
	public int cantidadDeFacturasRegistradas();
}
