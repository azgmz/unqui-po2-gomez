package punto11;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EquipoDeTrabajoTestCase {

	private Persona azul;
	private Persona juan;
	private Persona analia;
	private Persona manuel;
	private Persona deb;
	private ArrayList<Persona> integrantes;
	private EquipoDeTrabajo equipo1;
	
	@BeforeEach
	public void setUp() {
		azul = new Persona("Azul", "Gomez", 21);
		juan = new Persona("Juan", "Torres", 25);
		analia = new Persona("Analia", "Infanta", 30);
		manuel = new Persona("Manuel", "Machupichu", 36);
		deb = new Persona("Deb", "Gallagher", 18);
		
		integrantes = new ArrayList<Persona>();
		
		integrantes.add(azul);
		integrantes.add(juan);
		integrantes.add(analia);
		integrantes.add(manuel);
		integrantes.add(deb);
		
		equipo1 = new EquipoDeTrabajo("Equipo 1", integrantes);
	}
	
	@Test
	void testDeUnaPersonaSeSabeSuNombreApellidoYEdad() {
		assertEquals("Azul", azul.getNombre());
		assertEquals("Gomez", azul.getApellido());
		assertEquals(21, azul.getEdad());
	}
	
	@Test
	void testSeSabeElNombreDelEquipoDeTrabajo() {
		assertEquals("Equipo 1", equipo1.getNombre());
	}
	
	@Test 
	void testElEquipo1TieneAAzulYAJuan() {
		assertTrue(equipo1.tieneA(azul));
		assertTrue(equipo1.tieneA(juan));
		assertEquals(2, equipo1.cantidadDeIntegrantes());
	}
	
	@Test
	void testElPromedioDelEquipo1() {
		assertEquals(26d, equipo1.promedio());
	}

}

