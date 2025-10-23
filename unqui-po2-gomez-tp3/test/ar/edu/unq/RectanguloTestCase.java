package ar.edu.unq;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RectanguloTestCase {
	
	private Point verticeIzquierdoSuperior;
	private Point verticeDerechoInferior;
	public Rectangulo rectangulo;
	
	@BeforeEach
	public void setUp() throws Exception {
		verticeIzquierdoSuperior = new Point(2, 5);
		verticeDerechoInferior = new Point(6, 0);
		
		rectangulo = new Rectangulo(verticeIzquierdoSuperior, verticeDerechoInferior);
	}
	
	@Test
	void testCreacionDeUnRectangulo() {
		
		assertTrue(rectangulo.esRectangulo());
	}
	
	@Test
	void testCreacionDeUnNoRectangulo() {
		
		verticeIzquierdoSuperior = new Point(2, 3);
		verticeDerechoInferior = new Point(5, 0);
		
		try {
			new Rectangulo(verticeIzquierdoSuperior, verticeDerechoInferior);
		} catch (IllegalArgumentException e) {
	        assert e.getMessage().equals("Los puntos no forman un rectángulo");
	    }
	}
	
	@Test
	void testArea() {
		
		assertEquals(20f,rectangulo.area());
	}
	
	@Test
	void testPerimetro() {
		
		assertEquals(18f,rectangulo.perimetro());
	}
	
	@Test
	void testEsVertical() {
		
		assertTrue(rectangulo.esVertical());
		assertFalse(rectangulo.esHorizontal());
	}
}
