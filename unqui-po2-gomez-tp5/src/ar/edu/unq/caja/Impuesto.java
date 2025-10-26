package ar.edu.unq.caja;

public class Impuesto implements Servicio{
	
	private double montoFijo;
	private Factura factura;
	
	public Impuesto(double montoFijo) {
		this.montoFijo = montoFijo;
		this.factura = new Factura(calcularMonto());
	}
	
	@Override
	public double calcularMonto() {
		return montoFijo;
	}

	@Override
	public Factura getFactura() {
		return factura;
	}

}
