package ar.edu.unq;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PointTestCase {
	
	@Test
	void testCrearPuntoConCoordenas() {
		
		Point punto = new Point(3, 8);
		
		assertEquals( 3, punto.getX());
		assertEquals( 8, punto.getY());
	}
	
	@Test
	void testCrearPuntoSinCoordenas() {
		
		Point punto = new Point();
		
		assertEquals( 0, punto.getX());
		assertEquals( 0, punto.getY());
	}
	
	@Test
	void testPuntoQueSeMueve() {
		
		Point punto = new Point(3, 8);
		Point puntoEn00 = new Point();
		
		punto.setXY(4, 9);
		puntoEn00.setXY(1, 1);
		
		assertEquals( 4, punto.getX());
		assertEquals( 9, punto.getY());
		
		assertEquals( 1, puntoEn00.getX());
		assertEquals( 1, puntoEn00.getY());
	}
	
	@Test
	void testSeCreaOtroPuntoAPartirDeOtrosDos() {
		
		Point punto1 = new Point(1, 2);
		Point punto2 = new Point(4, 3);
		
		Point puntoSumado = punto1.sumarCon(punto2);
		
		assertEquals( 5, puntoSumado.getX());
		assertEquals( 5, puntoSumado.getY());
	}

}
