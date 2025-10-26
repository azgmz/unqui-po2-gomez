package ar.edu.unq;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TrabajadorTestCase {

	private Ingreso continuidad;
	private IngresoHorasExtras horasExtrasSept;
	private IngresoHorasExtras horasExtrasOct;
	
	private Trabajador trabajador;
	
	@BeforeEach
	public void setUp() {
		
		continuidad = new Ingreso("Septiembre", "Continuidad", 500d);
		horasExtrasSept = new IngresoHorasExtras("Septiembre", "HorasExtras", 0d, 0);
		horasExtrasOct = new IngresoHorasExtras("Octubre", "HorasExtras", 500d, 5);
		
		trabajador = new Trabajador();
		
		trabajador.añadirIngreso(continuidad);
		trabajador.añadirIngreso(horasExtrasSept);
		trabajador.añadirIngreso(horasExtrasOct);
		
	}
	
	@Test
	void testUnTrabajadorTieneIngresoDe() {
		assertTrue(trabajador.tieneIngresoDe(continuidad));
		assertTrue(trabajador.tieneIngresoDe(horasExtrasSept));
		assertTrue(trabajador.tieneIngresoDe(horasExtrasOct));
		assertEquals(2, trabajador.cantidadDeIngresos());
	}
	
	@Test
	void testElTotalPercibidoDeUnTrabajadorEs1000() {
		assertEquals(1000d, trabajador.getTotalPercibido());
	}
	
	@Test
	void testElTotalImponibleDeUnTrabajadorEs500() {
		assertEquals(500d, trabajador.getTotalImponible());
	}

	@Test
	void testElImpuestoAPagarDeUnTrabajadorEs10() {
		assertEquals(10d, trabajador.getImpuestoAPagar());
	}

	
}
