package ar.edu.unq;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class ClienteTestCase {
	
	private Cliente cliente1;
	
	@BeforeEach
	void setUp() throws Exception {
		cliente1 = new Cliente("Juan", "Cruz", "Monroe 123", 22, 10000d);
	}

	@Test
	void testUnClienteTieneNOmbreApellidoDireccionEdadYSueldoNetoMensual() {
		
		assertEquals(cliente1.getNombre(), "Juan");
		assertEquals(cliente1.getApellido(), "Cruz");
		assertEquals(cliente1.getDireccion(), "Monroe 123");
		assertEquals(cliente1.getEdad(), 22);
		assertEquals(cliente1.getSueldoNetoMensual(), 10000d);
		
	}
	

	@Test
	void testUnClienteSabeCuantoEsSuSueldoNetoAnual() {
		
		assertEquals(120000d, cliente1.sueldoNetoAnual());
		
	}

}
