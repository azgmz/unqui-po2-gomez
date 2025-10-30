package ar.edu.unq;

public abstract class SolicitudDeCredito {
	
	private Cliente cliente;
	private double montoSolicitado;
	private int plazoFijoEnMeses;
	private String estadoDeLaSolicitud;

	public SolicitudDeCredito(Cliente cliente, double montoSolicitado, int plazoFijoEnMeses) {
		this.cliente = cliente;
		this.montoSolicitado = montoSolicitado;
		this.plazoFijoEnMeses = plazoFijoEnMeses;
		this.estadoDeLaSolicitud = "Falta ser ingresada por un Banco";
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	public double getMontoSolicitado() {
		return montoSolicitado;
	}

	public int getPlazoFijoEnMeses() {
		return plazoFijoEnMeses;
	}
	
	public String getEstadoDeLaSolicitud() {
		return estadoDeLaSolicitud;
	}

	public void setEstadoDeLaSolicitud(String estadoDeLaSolicitud) {
		this.estadoDeLaSolicitud = estadoDeLaSolicitud;
	}
}
