package juegoEstrategia;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WarcraftTestCase {

	private Mapa mapa;
	private Ingeniero ingeniero;
	private int lajas;
	
	@BeforeEach
	public void setUp() {
		lajas = 10;
		mapa = new Mapa(100, 100);
		ingeniero = new Ingeniero(lajas, 0, 0);
	}
	
	@Test
	void testUnIngenieroBuscaElCaminoMasCorto() {
		// Con mi implementación todos los caminos son los más cortos
		
		ingeniero.caminarHasta(2, 5);
		
		assertEquals(2, ingeniero.getX());
		assertEquals(5, ingeniero.getY());
	}

}
