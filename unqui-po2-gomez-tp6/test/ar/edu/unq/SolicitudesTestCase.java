package ar.edu.unq;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolicitudesTestCase {
	
	private Cliente cliente;
	private PropiedadInmoviliaria propiedad;
	private SolicitudDeCreditoPersonal solicitudP;
	private SolicitudDeCreditoHipotecario solicitudH;
	
	@BeforeEach
	public void setUp() {
		cliente = new Cliente("Juan", "Cruz", "Monroe 123", 22, 10000);
		propiedad = new PropiedadInmoviliaria("Casa de un piso", "Calle falsa 123", 53000);
		solicitudP = new SolicitudDeCreditoPersonal(cliente, 100d, 5);
		solicitudH = new SolicitudDeCreditoHipotecario(cliente, 100d, 2, propiedad);

	}

	@Test
	void testUnaSolicitudSabeElMontoDeCadaCuota() {
		assertEquals(20, solicitudP.valorDeLaCuota());
		assertEquals(50, solicitudH.valorDeLaCuota());
	}

}
