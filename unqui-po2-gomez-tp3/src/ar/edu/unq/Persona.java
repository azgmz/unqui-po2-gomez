package ar.edu.unq;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
	
	private String nombre;
	private LocalDate fechaNacimiento;
	
	public Persona(String nombre, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

	public String getNombre() {
		return nombre;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public int edad() {
		return Period.between(fechaNacimiento, LocalDate.now()).getYears();
	}

	public boolean menorQue(Persona otraPersona) {
		return (this.edad() < otraPersona.edad());
	}

	public static Persona crearPersona(String unNombre, LocalDate unaFechaDeNacimiento) {
		return new Persona(unNombre, unaFechaDeNacimiento);
	}

}
