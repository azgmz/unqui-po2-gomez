package ar.edu.unq;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MultioperadorTestCase {

	private ArrayList<Integer> lista;
	
	@BeforeEach
	public void setUp() throws Exception {
		lista = new ArrayList<Integer>();
		
		lista.add(2);
		lista.add(4);
		lista.add(6);
		lista.add(8);
	}
	
	@Test
	void testSumarTodos() {
		assertEquals(20, Multioperador.sumarTodos(lista));
	}

	@Test
	void testRestarTodos() {
		assertEquals(-16, Multioperador.restarTodos(lista));
	}
	
	@Test
	void testMultiplicarTodos() {
		assertEquals(384, Multioperador.multiplicarTodos(lista));
	}
	
}

