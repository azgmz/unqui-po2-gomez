package ar.edu.unq;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BancoTestCase {
	
	private Cliente cliente1;
	private Banco bbva;
	private ArrayList<Cliente> lista;
	
	@BeforeEach
	void setUp() throws Exception {
		cliente1 = new Cliente("Juan", "Cruz", "Monroe 123", 22, 10000);
		bbva = new Banco();
		bbva.agregarCliente(cliente1);
		lista = new ArrayList<Cliente>();
		bbva.setClientes(lista);
	}

	@Test
	void agregarClienteTest() {
		
		assertTrue(bbva.tieneRegistradoA(cliente1));
		assertEquals(bbva.cantidadDeClientes(), 1);
		
		
	}

}
