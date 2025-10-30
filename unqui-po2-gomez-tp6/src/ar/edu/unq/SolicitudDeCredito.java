package ar.edu.unq;

public abstract class SolicitudDeCredito {
	
	private Cliente cliente;
	private double montoSolicitado;
	private int cantidadDeCuotas;
	private String estadoDeLaSolicitud;

	public SolicitudDeCredito(Cliente cliente, double montoSolicitado, int cantidadDeCuotas) {
		this.cliente = cliente;
		this.montoSolicitado = montoSolicitado;
		this.cantidadDeCuotas = cantidadDeCuotas;
		this.estadoDeLaSolicitud = "Falta ser ingresada por un Banco";
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	public double getMontoSolicitado() {
		return montoSolicitado;
	}

	public int getCantidadDeCuotas() {
		return cantidadDeCuotas;
	}
	
	public String getEstadoDeLaSolicitud() {
		return estadoDeLaSolicitud;
	}

	public void setEstadoDeLaSolicitud(String estadoDeLaSolicitud) {
		this.estadoDeLaSolicitud = estadoDeLaSolicitud;
	}

	public String datosDeLaSolicitud() {
		return cliente.getNombre() + " " + cliente.getApellido() + ". Monto: $" + montoSolicitado + ". Cuotas: " + cantidadDeCuotas;
	}

	public double valorDeLaCuota() {
		return montoSolicitado / cantidadDeCuotas;
	}
	
	public abstract double cuotaMaximaPermitida();
}
