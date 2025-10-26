package ar.edu.unq;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.caja.AgenciaRecaudadora;
import ar.edu.unq.caja.CajaConAgencia;
import ar.edu.unq.caja.Impuesto;
import ar.edu.unq.caja.ServicioEspecifico;

class CajaConAgenciaTestCase {
		
		private AgenciaRecaudadora agencia;
		private CajaConAgencia caja; 
		private ServicioEspecifico agua;
		private ServicioEspecifico luz;
		private Impuesto impuesto;
		
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
		
		@Test
		void testUnaCajaConAgenciaCobraImpuestoYLosNotificaASuAgencia() {
			
			impuesto = new Impuesto(350d);
			
			caja.cobrarServicio(impuesto);
			
			assertTrue(agencia.tieneFacturaDe(impuesto.getFactura()));
			assertEquals(1, agencia.cantidadDeFacturasRegistradas());
		}
}