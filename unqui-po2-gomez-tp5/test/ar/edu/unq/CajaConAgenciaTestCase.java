package ar.edu.unq;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CajaConAgenciaTestCase {
		
		private AgenciaRecaudadora agencia;
		private CajaConAgencia caja; 
		private ServicioEspecifico agua;
		private ServicioEspecifico luz;
		
		@BeforeEach
		public void setUp() {
		
			agencia = new AgenciaRecaudadora(); 
			caja = new CajaConAgencia(agencia);
		}
		
		@Test
		void testUnaCajaConAgenciaCobraServiciosYLosNotificaASuAgencia() {
			
			agua = new ServicioEspecifico(20d, 1000d);
			luz = new ServicioEspecifico(30d, 5000d);
			
			caja.cobrarServicio(agua);
			caja.cobrarServicio(luz);
			
			assertTrue(agencia.tieneFacturaDe(agua.getFactura()));
			assertTrue(agencia.tieneFacturaDe(luz.getFactura()));
			assertEquals(2, agencia.cantidadDeFacturasRegistradas());
		}
}