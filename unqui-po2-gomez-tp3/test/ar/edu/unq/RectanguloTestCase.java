package ar.edu.unq;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RectanguloTestCase {
	
	private Point verticeIzquierdoSuperior;
	private Point verticeDerechoInferior;
	
	@BeforeEach
	public void setUp() throws Exception {
		verticeIzquierdoSuperior = new Point(2, 5);
		verticeDerechoInferior = new Point(6, 0);
	}
	
	@Test
	void creacionDeUnRectangulo() {
		
		Rectangulo rectangulo = new Rectangulo(verticeIzquierdoSuperior, verticeDerechoInferior);
		
		assertTrue(rectangulo.esRectangulo());
	}

}
