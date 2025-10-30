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

	public int edadALaQueTerminariaDePagar() {
		int edadALaQueTermina = this.getCliente().getEdad();
		int cuotas = this.getCantidadDeCuotas();
		
		for(int cantCuotas = 1; cantCuotas <= cuotas; cantCuotas++) {
			if (cantCuotas % 12 == 0) {
				edadALaQueTermina++;
			}
		}
		
		return edadALaQueTermina;
	}

	public double cuotaMaximaPermitida() {
		return (getCliente().getSueldoNetoMensual()) * 0.5;
	}

	public double montoTotalPermitido() {
		return propiedad.getValorFiscal() * 0.7;
	}

}
