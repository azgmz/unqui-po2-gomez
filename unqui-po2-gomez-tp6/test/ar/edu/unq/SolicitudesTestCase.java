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
		cliente = new Cliente("Juan", "Cruz", "Monroe 123", 64, 1250);
		propiedad = new PropiedadInmoviliaria("Casa de un piso", "Calle falsa 123", 1000);
		
		solicitudP = new SolicitudDeCreditoPersonal(cliente, 3500, 4);
		solicitudH = new SolicitudDeCreditoHipotecario(cliente, 700 , 12, propiedad);
		
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
	
	@Test
	void testUnBancoAceptaLaSolicitudDeCreditoHipotecarioSiTiene65AniosOMenosLaCuotaNoSupereEl50PorCientoDelSueldoMensualYElMontoTotalNoSupereEl75PorCientoDelValorDeLaPropiedad() {

		bbva.clienteSolicitaCredito(solicitudH);
		bbva.aceptarSolicitud(solicitudH);
		
		assertEquals(65 ,solicitudH.edadALaQueTerminariaDePagar());
		assertTrue(solicitudH.valorDeLaCuota() <= solicitudH.cuotaMaximaPermitida());
		assertEquals(solicitudH.getMontoSolicitado(), solicitudH.montoTotalPermitido());
		assertEquals("Aceptada", solicitudH.getEstadoDeLaSolicitud());
	}

}
