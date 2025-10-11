package ar.edu.unq.po2.tp3.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.DesarmadorDeNumeros;

class DesarmadorDeNumerosTestCase {
	private DesarmadorDeNumeros listaDeNumeros;
	
	@BeforeEach
	public void setUp() throws Exception {
		List<Integer> numeros = new ArrayList<>();
		numeros.add(220);
		numeros.add(231);
		numeros.add(2246);
		numeros.add(22);
		numeros.add(2);
		
		listaDeNumeros = new DesarmadorDeNumeros(numeros);
	}
	
	@Test
	public void testNumeroConMasDigitosPares() {
		assertEquals(2246, listaDeNumeros.numeroConMasDigitosPares());
	}

}
