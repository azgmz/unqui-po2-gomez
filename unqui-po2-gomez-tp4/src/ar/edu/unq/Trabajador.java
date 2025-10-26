package ar.edu.unq;

import java.util.ArrayList;
import java.util.List;

public class Trabajador {
	private List<Ingreso> ingresos;
	
	public Trabajador() {
		this.ingresos = new ArrayList<Ingreso>();
	}
	
	public List<Ingreso> getIngresos(){
		return ingresos;
	}

	public void añadirIngreso(Ingreso ingreso) {
		ingresos.add(ingreso);
	}

	public boolean tieneIngresoDe(Ingreso ingreso) {
		return ingresos.contains(ingreso);
	}

	public int cantidadDeIngresos() {
		return ingresos.size();
	}

	public double getTotalPercibido() {
		double totalPercibido = 0;
		for (Ingreso ingreso : ingresos) {
			totalPercibido += ingreso.getMonto();
		}
		return totalPercibido;
	}

	public double getTotalImponible() {
		double totalImponible = 0;
		for (Ingreso ingreso : ingresos) {
			totalImponible += ingreso.montoImponible();
		}
		return totalImponible;
	}

	public double getImpuestoAPagar() {
		return getTotalImponible() * 0.02;
	}

}
