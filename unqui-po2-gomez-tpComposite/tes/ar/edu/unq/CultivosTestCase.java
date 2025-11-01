package ar.edu.unq;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CultivosTestCase {

	private Trigo trigo;
	private Soja soja;
	
	private PorcionPura porcionPuraTrigo, porcionPuraSoja, p1, p2;
	private PorcionMixta porcionMixta;
	
	
	@BeforeEach
	public void setUp() {
		trigo = new Trigo(3);
		soja = new Soja(5);
		
		porcionPuraTrigo = new PorcionPura(trigo);
		porcionPuraSoja = new PorcionPura(soja);
		p1 = new PorcionPura(trigo);
		p2 = new PorcionPura(soja);
		
		int maximoDeCultivos = 100;
		for(int i = 0; i < maximoDeCultivos; i++) {
			porcionPuraTrigo.plantar(trigo);
		}
		porcionPuraSoja.plantar(soja);
		p1.plantar(trigo);
		p2.plantar(soja);
		p1.plantar(trigo);
		p2.plantar(soja);
		
		
		porcionMixta = new PorcionMixta(porcionPuraTrigo, porcionPuraSoja, p1, p2);
	
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

	@Test
	void testEnUnaPorcionMixtaSeTienenCuatroPorcionesParaCultivarUnTipoDeCultivo() {
		 assertTrue(porcionMixta.contienePorcion(porcionPuraTrigo));
		 assertTrue(porcionMixta.contienePorcion(porcionPuraSoja));
		 assertTrue(porcionMixta.contienePorcion(p1));
		 assertTrue(porcionMixta.contienePorcion(p2));
	}

	@Test
	void testGananciaAnualEstimadaDeUnaPorcionMixta() {
		 assertEquals(3852, porcionMixta.gananciaAnualEstimada());
	}
	

}
