package ar.edu.unq;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BancoTestCase {
	
	private Cliente cliente1;
	private Cliente cliente2;
	private Banco bbva;
	private SolicitudDeCreditoPersonal solicitudCreditoPersonal;
	private SolicitudDeCreditoHipotecario solicitudCreditoHipotecario;
	private PropiedadInmoviliaria propiedad;
	
	@BeforeEach
	void setUp() throws Exception {
		cliente1 = new Cliente("Juan", "Cruz", "Monroe 123", 22, 10000);
		bbva = new Banco();
		solicitudCreditoPersonal = new SolicitudDeCreditoPersonal(cliente1, 100d, 5);
		
		bbva.agregarCliente(cliente1);
		
		propiedad = new PropiedadInmoviliaria("Descripción", "Dirección", 1000);
		solicitudCreditoHipotecario = new SolicitudDeCreditoHipotecario(cliente1, 100d, 12, propiedad);

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
	void testSoloLosClientesDelBancoPuedenPedirSolicitudes() {
		
		cliente2 = new Cliente("Manuel", "Aristoteles", "Calle Falsa 123", 50, 53000);
		propiedad = new PropiedadInmoviliaria("Descripción", "Dirección", 10000);
		solicitudCreditoHipotecario = new SolicitudDeCreditoHipotecario(cliente2, 50000, 25, propiedad);
		
		
		Exception fallo = assertThrows(IllegalArgumentException.class, () -> {
			bbva.clienteSolicitaCredito(solicitudCreditoHipotecario);
	        });
		
		 assertEquals("Solo clientes del banco pueden solicitar un credito", fallo.getMessage());
		
	}
	
	
	@Test
	void testSiUnClienteNoSolicitaLaSolicitudEnUnBancoEstaNoPuedeSerProcesada() {
		assertEquals("Falta ser ingresada por un Banco", solicitudCreditoPersonal.getEstadoDeLaSolicitud());
		
	}
	
	@Test
	void testSiLaSolicitudDeCreditoDelClienteSeApruebaLeOtorgaElDineroSolicitado() {
		
		bbva.clienteSolicitaCredito(solicitudCreditoPersonal);
		
		bbva.setDineroDisponible(200);
		
		bbva.aceptarSolicitud(solicitudCreditoPersonal);
		
		assertEquals(100d, bbva.getDineroDisponible());
	}

	@Test
	void testElBancoSoloPuedeAceptarSolicitudesQueTengaRegistradas() {

		 Exception fallo = assertThrows(IllegalArgumentException.class, () -> {
			 bbva.aceptarSolicitud(solicitudCreditoHipotecario);
	        });
		
		 assertEquals("No hay registro de la solicitud", fallo.getMessage());
	}
	
	@Test
	void testElBancoTieneRegistroDeTodasLosTiposDeSolicitudes() {

		bbva.clienteSolicitaCredito(solicitudCreditoPersonal);
		bbva.clienteSolicitaCredito(solicitudCreditoHipotecario);
		
		assertTrue(bbva.tieneSolicitud(solicitudCreditoPersonal));
		assertTrue(bbva.tieneSolicitud(solicitudCreditoHipotecario));
		assertEquals(2, bbva.cantidadDeSolicitudes());
	}

	@Test
	void testElBancoTieneRegistroDelClienteElMontoYElPlazoEnMesesDeTodaSolicitud() {
		
		bbva.clienteSolicitaCredito(solicitudCreditoHipotecario);
		
		assertEquals("Juan Cruz. Monto: $100.0. Cuotas: 12", bbva.datosDeLaSolicitud(solicitudCreditoHipotecario));
	}
	
	@Test
	void testElBancoSoloTieneRegistroDeLosDatosDeLaSolicitudSiEstaLoEstaTambien() {
	
		Exception fallo = assertThrows(IllegalArgumentException.class, () -> {
			 bbva.aceptarSolicitud(solicitudCreditoHipotecario);
	        });
		
		 assertEquals("No hay registro de la solicitud", fallo.getMessage());
	}


}
