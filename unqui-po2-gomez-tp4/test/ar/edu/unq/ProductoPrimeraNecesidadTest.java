package ar.edu.unq;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import src.ProductoPrimeraNecesidad;

import static org.junit.jupiter.api.Assertions.*;

public class ProductoPrimeraNecesidadTest {

	private ProductoPrimeraNecesidad leche;
	
	@BeforeEach
	public void setUp() {
		leche = new ProductoPrimeraNecesidad("Leche", 8d, false, 20d);
	}
	
	@Test
	void testCalcularPrecio() {
		assertEquals(1.44d, leche.getPrecioFinal());
	}

}
