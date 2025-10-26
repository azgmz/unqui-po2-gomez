package ar.edu.unq;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.caja.Factura;
import ar.edu.unq.caja.ServicioEspecifico;

class ServiciosTestCase {
	
	private ServicioEspecifico agua;
	private ServicioEspecifico luz;
	private Factura factura;
	
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
	
	@Test
	void testElServicioEnSuFacturaGuardaElMontoPorElServicio() {
		
		factura = agua.getFactura();
		
		assertEquals(20000d, factura.getMonto());
	}

}
