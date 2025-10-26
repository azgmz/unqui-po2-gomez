package ar.edu.unq;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ServiciosTestCase {
	
	private ServicioEspecifico agua;
	private ServicioEspecifico luz;
	
	@BeforeEach
	public void setUp() {
		agua = new ServicioEspecifico(20d, 1000d);
		luz = new ServicioEspecifico(30d, 5000d);
	}
	
	@Test
	void testSePuedeCalcularElMontoPorServicioDeAgua() {
		assertEquals(20000d, agua.calcularMonto());
	}
	
	@Test
	void testSePuedeCalcularElMontoPorServicioDeLuz() {
		assertEquals(150000d, luz.calcularMonto());
	}

}
