package ar.edu.unq;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonaTestCase {
	
	private Persona azul;
	private Persona juan;
	private Persona manuel;
	
	@BeforeEach
	public void setUp() {
		azul = new Persona("Azul", LocalDate.of(2004, 2, 20));
		juan = new Persona("Juan", LocalDate.of(2000, 8, 16));
	}

	@Test
	void testSePuedeSaberLosDatosDeUnaPersona() {
		
		assertEquals("Azul", azul.getNombre());
		assertEquals(LocalDate.of(2004, 2, 20), azul.getFechaNacimiento());
		assertEquals(21, azul.edad());
	}
	
	@Test
	void testJuanEsMenorQueAzul() {
		assertFalse(juan.menorQue(azul));
		
	}
	
	@Test
	void testAzulEsMenorQueJuan() {
		assertTrue(azul.menorQue(juan));
	}
	
	@Test
	void testCreaAManuel() {
		manuel = Persona.crearPersona("Manuel", LocalDate.of(2002, 10, 5));
		
		assertEquals("Manuel", manuel.getNombre());
		assertEquals(LocalDate.of(2002, 10, 5), manuel.getFechaNacimiento());
		assertEquals(23, manuel.edad());
		
	}

}
