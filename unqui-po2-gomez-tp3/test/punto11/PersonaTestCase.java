package punto11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonaTestCase {

	private Persona azul;
	
	@BeforeEach
	public void setUp() {
		azul = new Persona("Azul", "Gomez", 21);
		
	}
	
	@Test
	void testDeUnaPersonaSeSabeSuNombreApellidoYEdad() {
		assertEquals("Azul", azul.getNombre());
		assertEquals("Gomez", azul.getApellido());
		assertEquals(21, azul.getEdad());
	}

}
