package ar.edu.unq;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonaTestCase {
	
	private Persona azul;
	
	@BeforeEach
	public void setUp() {
		azul = new Persona("Azul", LocalDate.of(2004, 2, 20));
	}

	@Test
	void testSePuedeSaberLosDatosDeUnaPersona() {
		
		assertEquals("Azul", azul.getNombre());
		assertEquals(LocalDate.of(2004, 2, 20), azul.getFechaNacimiento());
		assertEquals(21, azul.edad());
	}

}
