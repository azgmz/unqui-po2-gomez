package ar.edu.unq;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CounterTestCase {
private Counter counter;

@BeforeEach
public void setUp() throws Exception {
//Se crea el contador
counter = new Counter();
//Se agregan los numeros. Un solo par y nueve impares
counter.agregarNumero(1);
counter.agregarNumero(3);
counter.agregarNumero(5);
counter.agregarNumero(7);
counter.agregarNumero(9);
counter.agregarNumero(1);
counter.agregarNumero(1);
counter.agregarNumero(1);
counter.agregarNumero(1);
counter.agregarNumero(4);
}

@Test
public void testEvenNumbers() {
int amount = counter.cantidadDeImpares();
assertEquals(amount, 9);
}
}