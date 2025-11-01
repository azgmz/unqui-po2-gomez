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
	
	}
	
	@Test
	void testEnUnaPorcionPuraDeUnCultivoSePuedePlantarEseCultivo() {
		porcionPuraTrigo.plantar(trigo);
		porcionPuraSoja.plantar(soja);
		
		assertTrue(porcionPuraTrigo.tienePlantado(trigo));
		assertTrue(porcionPuraSoja.tienePlantado(soja));
	}
	
	@Test
	void testEnUnaPorcionPuraSePuedeTenerHasta100Cultivos() {
		int maximoDeCultivos = 100;
		for(int i = 0; i < maximoDeCultivos; i++) {
			porcionPuraTrigo.plantar(trigo);
		}
		assertEquals(100, porcionPuraTrigo.getCantidadDeCultivo());
	}
	
	@Test
	void testEnUnaPorcionPuraNoPuedeTenerMasDe100Cultivos() {
		int maximoDeCultivos = 100;
		for(int i = 0; i < maximoDeCultivos; i++) {
			porcionPuraTrigo.plantar(trigo);
		}
		Exception fallo = assertThrows(IllegalArgumentException.class, () -> {
			porcionPuraTrigo.plantar(trigo);
	        });
		
		 assertEquals("No se pueden plantar más de 100 cultivos", fallo.getMessage());
	}

}
