package ar.edu.unq;

public class SolicitudDeCreditoHipotecario extends SolicitudDeCredito{

	private PropiedadInmoviliaria propiedad;
	
	public SolicitudDeCreditoHipotecario(Cliente cliente, double montoSolicitado, int cantidadDeCuotas, PropiedadInmoviliaria propiedad) {
		super(cliente, montoSolicitado, cantidadDeCuotas);
		this.propiedad = propiedad;
	}
	
	public PropiedadInmoviliaria getPropiedad() {
		return propiedad;
	}

}
