package ar.edu.unq.caja;

public class ServicioEspecifico implements Servicio{

	private double costoPorUnidad;
	private double unidadesConsumidas;
	private Factura factura;
	
	public ServicioEspecifico(double costoPorUnidad, double unidadesConsumidas) {
		this.costoPorUnidad = costoPorUnidad;
		this.unidadesConsumidas = unidadesConsumidas;
		this.factura = new Factura(calcularMonto());
	}
	
	@Override
	public double calcularMonto() {
		return costoPorUnidad * unidadesConsumidas;
	}

	@Override
	public Factura getFactura() {
		return factura;
	}

}
