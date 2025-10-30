package ar.edu.unq;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	List<Cliente> clientes;
	List<SolicitudDeCredito> solicitudes;
	
	public Banco() {
		this.clientes = new ArrayList<Cliente>();
		this.solicitudes = new ArrayList<SolicitudDeCredito>();
	}
	
	public void agregarCliente(Cliente cliente) {
		this.clientes.add(cliente);
	}

	public boolean tieneRegistradoA(Cliente cliente) {
		return this.clientes.contains(cliente);
	}

	public int cantidadDeClientes() {
		return this.clientes.size();
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void clienteSolicitaCredito(SolicitudDeCredito solicitudCredito) {
		solicitudes.add(solicitudCredito);
		solicitudCredito.setEstadoDeLaSolicitud("Procesando");
		
	}

	public boolean tieneSolicitud(SolicitudDeCredito solicitudCredito) {
		return solicitudes.contains(solicitudCredito);
	}
	
	
	
}
