package ar.edu.unq;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CajaTestCase {
	
	private ProductoCooperativa productoC;
	private ProductoTradicional productoT;
	private Caja caja; 
	
	@BeforeEach
	public void setUp() {
		productoC = new ProductoCooperativa(3, 100d);
		productoT = new ProductoTradicional(1, 150d);
		
		caja = new Caja();
		
		caja.registrarProducto(productoC);
		caja.registrarProducto(productoC);
		caja.registrarProducto(productoT);
	}
	
	@Test
	void testLosProductosSeRegistranEnLaCajaYBajanSuStock() {
		
		assertTrue(caja.tieneRegistrado(productoC));
		assertTrue(caja.tieneRegistrado(productoT));
		
		assertEquals(3, caja.cantidadDeProductosRegistrados());
		
		assertEquals(1, productoC.getStock());
		assertEquals(0, productoT.getStock());
		
	}

}
