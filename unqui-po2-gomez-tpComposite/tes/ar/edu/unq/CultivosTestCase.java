package ar.edu.unq;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CultivosTestCase {

	private Trigo trigo;
	private Soja soja;
	
	private PorcionPura porcionPuraTrigo;
	private PorcionPura porcionPuraSoja;
	//private ProcionMixta porcionMixta;
	
	
	@BeforeEach
	public void setUp() {
		trigo = new Trigo(3);
		soja = new Soja(5);
		
		porcionPuraTrigo = new PorcionPura(trigo);
		porcionPuraSoja = new PorcionPura(soja);
		//porcionMixta = new PorcionMixta();
		
		int maximoDeCultivos = 100;
		for(int i = 0; i < maximoDeCultivos; i++) {
			porcionPuraTrigo.plantar(trigo);
		}
		porcionPuraSoja.plantar(soja);
	
	}
	
	@Test
	void testEnUnaPorcionPuraDeUnCultivoSePuedePlantarEseCultivo() {
		assertTrue(porcionPuraTrigo.tienePlantado(trigo));
		assertTrue(porcionPuraSoja.tienePlantado(soja));
	}
	
	@Test
	void testEnUnaPorcionPuraSePuedeTenerHasta100Cultivos() {
		assertEquals(100, porcionPuraTrigo.getCantidadDeCultivo());
	}
	
	@Test
	void testEnUnaPorcionPuraNoPuedeTenerMasDe100Cultivos() {
		Exception fallo = assertThrows(IllegalArgumentException.class, () -> {
			porcionPuraTrigo.plantar(trigo);
	        });
		
		 assertEquals("No se pueden plantar más de 100 cultivos", fallo.getMessage());
	}
	
	@Test
	void testGananciaAnualEstimadaDeUnaPorcionPura() {
		 assertEquals(3600, porcionPuraTrigo.gananciaAnualEstimada());
		 assertEquals(60, porcionPuraSoja.gananciaAnualEstimada());
	}


}
