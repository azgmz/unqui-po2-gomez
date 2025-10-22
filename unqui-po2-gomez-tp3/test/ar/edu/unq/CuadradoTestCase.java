package ar.edu.unq;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CuadradoTestCase {
		
		private Point verticeIzquierdoSuperior;
		private Point verticeDerechoInferior;
		public Cuadrado cuadrado;
		
		@BeforeEach
		public void setUp() throws Exception {
			verticeIzquierdoSuperior = new Point(2, 3);
			verticeDerechoInferior = new Point(5, 0);
			
			cuadrado = new Cuadrado(verticeIzquierdoSuperior, verticeDerechoInferior);
		}
		
		@Test
		void testCreacionDeUnCuadrado() {
			assertTrue(cuadrado.esCuadrado());
		}
		
		@Test
		void testCreacionDeUnNoCuadrado() {
			
			verticeIzquierdoSuperior = new Point(2, 5);
			verticeDerechoInferior = new Point(6, 0);
			
			try {
				new Cuadrado(verticeIzquierdoSuperior, verticeDerechoInferior);
			} catch (IllegalArgumentException e) {
		        assert e.getMessage().equals("Los puntos no forman un cuadrado");
		    }
		}
}
