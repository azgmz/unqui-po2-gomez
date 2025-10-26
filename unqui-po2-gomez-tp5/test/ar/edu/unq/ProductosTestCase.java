package ar.edu.unq;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.caja.ProductoCooperativa;
import ar.edu.unq.caja.ProductoTradicional;

class ProductosTestCase {

	private ProductoCooperativa productoC;
	private ProductoTradicional productoT;
	
	@BeforeEach
	public void setUp() {
		productoC = new ProductoCooperativa(20, 100d);
		productoT = new ProductoTradicional(50, 150d);
	}
	
	@Test
	void testUnProductoTieneStockYPrecioFinal() {
		assertEquals(20, productoC.getStock());
		assertEquals(50, productoT.getStock());
		
		assertEquals(90d, productoC.getPrecioFinal());
		assertEquals(150d, productoT.getPrecioFinal());
	}

}
