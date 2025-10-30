package ar.edu.unq;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolicitudesTestCase {
	
	private Cliente cliente;
	private PropiedadInmoviliaria propiedad;
	private SolicitudDeCreditoPersonal solicitudP;
	private SolicitudDeCreditoHipotecario solicitudH;
	private Banco bbva;
	
	@BeforeEach
	public void setUp() {
		cliente = new Cliente("Juan", "Cruz", "Monroe 123", 22, 1250);
		propiedad = new PropiedadInmoviliaria("Casa de un piso", "Calle falsa 123", 53000);
		solicitudP = new SolicitudDeCreditoPersonal(cliente, 3500, 4);
		solicitudH = new SolicitudDeCreditoHipotecario(cliente, 100d, 2, propiedad);
		bbva = new Banco();
		
		bbva.agregarCliente(cliente);

	}

	@Test
	void testUnaSolicitudSabeElMontoDeCadaCuota() {
		assertEquals(875, solicitudP.valorDeLaCuota());
		assertEquals(50, solicitudH.valorDeLaCuota());
	}
	
	@Test
	void testUnBancoAceptaLaSolicitudDeCreditoPersonalSiLosIngresosAnualesSonAlMenosDe15000YQueLaCuotaNoSupereEl70POrCientoDeSusIngresosMensuales() {

		bbva.clienteSolicitaCredito(solicitudP);
		bbva.aceptarSolicitud(solicitudP);
		
		assertEquals(15000d ,cliente.sueldoNetoAnual());
		assertEquals(solicitudP.valorDeLaCuota(), solicitudP.cuotaMaximaPermitida());
		assertEquals("Aceptada", solicitudP.getEstadoDeLaSolicitud());
	}

}
