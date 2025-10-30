package ar.edu.unq;

public class SolicitudDeCreditoHipotecario extends SolicitudDeCredito{

	private PropiedadInmoviliaria propiedad;
	
	public SolicitudDeCreditoHipotecario(Cliente cliente, double montoSolicitado, int plazoFijoEnMeses, PropiedadInmoviliaria propiedad) {
		super(cliente, montoSolicitado, plazoFijoEnMeses);
		this.propiedad = propiedad;
	}
	
	public PropiedadInmoviliaria getPropiedad() {
		return propiedad;
	}

}
