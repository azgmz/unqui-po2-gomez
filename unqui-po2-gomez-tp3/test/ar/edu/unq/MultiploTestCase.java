package ar.edu.unq.po2.tp3.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import src.ar.edu.unq.po2.tp3.Multiplo;

class MultiploTestCase {
	@Test
    void testMultiplo3Y9() {
        assertEquals(999, Multiplo.maxMultiploEntre0Y1000(3, 9));
    }
	
	@Test
	void testMultiploGrande() {
	    assertEquals(-1, Multiplo.maxMultiploEntre0Y1000(600, 700));
	}
}