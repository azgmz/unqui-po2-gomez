package ar.edu.unq;

import java.util.function.BooleanSupplier;

public class Rectangulo {

	private Point verticeIzquierdoSuperior;
	private Point verticeDerechoInferior;
	
	public Rectangulo(Point verticeIzquierdoSuperior, Point verticeDerechoInferior) {
		
		this.setVerticeIzquierdoSuperior(verticeIzquierdoSuperior);
		this.setVerticeDerechoInferior(verticeDerechoInferior);
		
		if (!esRectangulo()) {
			throw new IllegalArgumentException("Los puntos no forman un rectángulo");
		}
	}

	public Point getVerticeIzquierdoSuperior() {
		return verticeIzquierdoSuperior;
	}

	public void setVerticeIzquierdoSuperior(Point verticeIzquierdoSuperior) {
		this.verticeIzquierdoSuperior = verticeIzquierdoSuperior;
	}

	public Point getVerticeDerechoInferior() {
		return verticeDerechoInferior;
	}

	public void setVerticeDerechoInferior(Point verticeDerechoInferior) {
		this.verticeDerechoInferior = verticeDerechoInferior;
	}

	public boolean esRectangulo() {
		
		float vdix = verticeDerechoInferior.getX();
		float visy = verticeIzquierdoSuperior.getY();
		
		if (vdix == visy) {
			return false; //Crea una línea, no un rectangulo
		}
		
		if (vdix == 0 && visy == 0) {
			return false; //Crea una línea, no un rectangulo
		}
		
		if (this.base() == this.altura()) {
			return false; //Crea un cuadrado, no un rectangulo
		}
		
		return true;
	}
	
	private float base() {
		return Math.abs(verticeDerechoInferior.getX() - verticeIzquierdoSuperior.getX());
	}
	
	private float altura() {
		return Math.abs(verticeIzquierdoSuperior.getY() - verticeDerechoInferior.getY());
	}

	public float area() {
		return this.base() * this.altura();
	}
	
}
