package videojuego;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class VideojuegoTestCase {

	private MaquinaDeVideojuego maquina;
	//private Ficha ficha;
	
	@BeforeEach
	public void setUp() {
		maquina = new MaquinaDeVideojuego();
		//ficha = new Ficha();
	}
	
	@Test
	void testTodaMaquinaSeCreaConElEstadoApagada() {
		assertTrue(maquina.estaApagada());
	}
	
	@Test
	void testCuandoUnaMaquinaSePrendeYSeTocaElBotonDeInicioSeGeneralUnCartelQueIndicaMeterFichas() {
		maquina.encender();
		maquina.esPrecionadoBotonDeInicio();
	}


}
