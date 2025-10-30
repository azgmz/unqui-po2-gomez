package ar.edu.unq;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BancoTestCase {
	
	private Cliente cliente1;
	private Banco bbva;
	private SolicitudDeCreditoPersonal solicitudCreditoPersonal;
	
	@BeforeEach
	void setUp() throws Exception {
		cliente1 = new Cliente("Juan", "Cruz", "Monroe 123", 22, 10000);
		bbva = new Banco();
		solicitudCreditoPersonal = new SolicitudDeCreditoPersonal(cliente1 ,100d, 5);
		
		bbva.agregarCliente(cliente1);

	}

	@Test
	void testAgregarClienteTest() {
		
		assertTrue(bbva.tieneRegistradoA(cliente1));
		assertEquals(bbva.cantidadDeClientes(), 1);
		
		
	}
	
	@Test
	void testUnClientePideUnCréditoAlBancoYEsteCreaLaSolicitudDeCrédito() {
		
		bbva.clienteSolicitaCredito(solicitudCreditoPersonal);
		
		assertTrue(bbva.tieneSolicitud(solicitudCreditoPersonal));
		assertEquals("Procesando", solicitudCreditoPersonal.getEstadoDeLaSolicitud());
		
	}
	
	@Test
	void testSiUnClienteNoSolicitaLaSolicitudEnUnBancoEstaNoPuedeSerProcesada() {
		assertEquals("Falta ser ingresada por un Banco", solicitudCreditoPersonal.getEstadoDeLaSolicitud());
		
	}

}
