package punto11;

import java.util.ArrayList;

public class EquipoDeTrabajo {
	private String nombre;
	private ArrayList<Persona> integrantes;
	
	public EquipoDeTrabajo(String nombre, ArrayList<Persona> integrantes) {
		this.nombre = nombre;
		this.integrantes = integrantes;
	}

	public String getNombre() {
		return nombre;
	}

	public ArrayList<Persona> getIntegrantes() {
		return integrantes;
	}

	public int cantidadDeIntegrantes() {
		return integrantes.size();
	}

	public boolean tieneA(Persona unaPersona) {
		return integrantes.contains(unaPersona);
	}
	
}
