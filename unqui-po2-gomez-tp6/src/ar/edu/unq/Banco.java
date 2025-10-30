package ar.edu.unq;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	List<Cliente> clientes;
	List<SolicitudDeCredito> solicitudes;
	double dineroDisponible;
	
	public Banco() {
		this.clientes = new ArrayList<Cliente>();
		this.solicitudes = new ArrayList<SolicitudDeCredito>();
		this.dineroDisponible = 0;
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
	
	public void setDineroDisponible(double dineroDisponible) {
		this.dineroDisponible = dineroDisponible;
	}

	public void clienteSolicitaCredito(SolicitudDeCredito solicitudCredito) {
		if (tieneRegistradoA(solicitudCredito.getCliente())) {
			solicitudes.add(solicitudCredito);
			solicitudCredito.setEstadoDeLaSolicitud("Procesando");
		} else {
			throw new IllegalArgumentException("Solo clientes del banco pueden solicitar un credito");
		}

		
	}

	public boolean tieneSolicitud(SolicitudDeCredito solicitudCredito) {
		return solicitudes.contains(solicitudCredito);
	}

	public void aceptarSolicitud(SolicitudDeCredito solicitudCredito) {
		if (solicitudes.contains(solicitudCredito)) {
			solicitudCredito.setEstadoDeLaSolicitud("Aceptada");
			dineroDisponible -= solicitudCredito.getMontoSolicitado();
		} else {
			throw new IllegalArgumentException("No hay registro de la solicitud");
		}
	}

	public int cantidadDeSolicitudes() {
		return solicitudes.size();
	}
	
	
	
}
