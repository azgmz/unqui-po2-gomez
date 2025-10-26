package ar.edu.unq;

import java.util.ArrayList;
import java.util.List;

public class AgenciaRecaudadora implements Agencia{

	private List<Factura> facturas;
	
	public AgenciaRecaudadora() {
		this.facturas = new ArrayList<Factura>();
	}
	
	@Override
	public void registrarPago(Factura factura) {
		facturas.add(factura);
	}

	public boolean tieneFacturaDe(Factura factura) {
		return facturas.contains(factura);
	}

	public int cantidadDeFacturasRegistradas() {
		return facturas.size();
	}

}
