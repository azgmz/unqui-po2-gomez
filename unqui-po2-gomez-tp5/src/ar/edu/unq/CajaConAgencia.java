package ar.edu.unq;

public class CajaConAgencia extends Caja {
	
	private Agencia agencia;
	
	public CajaConAgencia(Agencia agencia) {
		super();
		this.agencia = agencia;
	}
	
	public void cobrarServicio(Servicio servicio) {
		agencia.registrarPago(servicio.getFactura());
	}
	
}
