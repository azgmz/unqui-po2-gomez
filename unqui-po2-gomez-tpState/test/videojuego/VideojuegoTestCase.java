package videojuego;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class VideojuegoTestCase {

	private MaquinaDeVideojuego maquina;
	
	@BeforeEach
	public void setUp() {
		maquina = new MaquinaDeVideojuego();
	}
	
	@Test
	void testTodaMaquinaSeCreaConElEstadoApagada() {
		assertTrue(maquina.estaApagada());
	}
	
	@Test
	void testCuandoUnaMaquinaSePrendeYSeTocaElBotonDeInicioSeGeneralUnCartelQueIndicaMeterFichas() {
		maquina.encender();
		maquina.esPrecionadoBotonDeInicio();
		
		assertTrue(maquina.estaEncendida());
	}

	@Test
	void testSiSeIngresaUnaFichaConLaMaquinaEncendidaPuedeJugarUnaPersonaYLaMaquinaPasaAlEstadoJugando() {
		maquina.encender();
		maquina.insertarFicha();
		maquina.esPrecionadoBotonDeInicio();
		
		assertTrue(maquina.estaJugando());
	}
	
	@Test
	void testSiSeIngresanDosFichaConLaMaquinaEncendidaPuedenJugarDosPersonasYLaMaquinaPasaAlEstadoJugando() {
		maquina.encender();
		maquina.insertarFicha();
		maquina.insertarFicha();
		maquina.esPrecionadoBotonDeInicio();
		
		assertTrue(maquina.estaJugando());
	}
	
	@Test
	void testCuandoUnaMaquinaTerminaElJuegoEstaSeReinicia() {
		maquina.encender();
		maquina.insertarFicha();
		maquina.insertarFicha();
		maquina.esPrecionadoBotonDeInicio();
		maquina.terminarJuego();
		
		assertEquals(0, maquina.getfichasInsertadas());
		assertTrue(maquina.estaApagada());
	}



}
