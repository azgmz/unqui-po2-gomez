package ar.edu.unq;

public class SolicitudDeCreditoPersonal extends SolicitudDeCredito{
	
	public SolicitudDeCreditoPersonal(Cliente cliente, double montoSolicitado, int cantidadDeCuotas) {
		super(cliente, montoSolicitado, cantidadDeCuotas);
	}

	public double cuotaMaximaPermitida() {
		return 0.7 * (getCliente().getSueldoNetoMensual());
	}


}
