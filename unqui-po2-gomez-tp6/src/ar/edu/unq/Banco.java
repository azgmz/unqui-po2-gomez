package ar.edu.unq;

import java.util.ArrayList;

public class Banco {
	
	ArrayList<Cliente> clientes;
	
	public void agregarCliente(Cliente cliente) {
		this.clientes.add(cliente);
	}

	public Boolean tieneRegistradoA(Cliente cliente) {
		return this.clientes.contains(cliente);
	}

	public Integer cantidadDeClientes() {
		return this.clientes.size();
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	
	
}
