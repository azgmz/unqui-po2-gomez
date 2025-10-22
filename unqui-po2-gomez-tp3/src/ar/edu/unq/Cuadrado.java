package ar.edu.unq;

public class Cuadrado extends FiguraGeometrica {
	
	private Point verticeIzquierdoSuperior;
	private Point verticeDerechoInferior;
	
	public Cuadrado(Point verticeIzquierdoSuperior, Point verticeDerechoInferior) {
		
		this.setVerticeIzquierdoSuperior(verticeIzquierdoSuperior);
		this.setVerticeDerechoInferior(verticeDerechoInferior);
		
		if (!esCuadrado()) {
			throw new IllegalArgumentException("Los puntos no forman un cuadrado");
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

	public boolean esCuadrado() {
		
		float vdix = verticeDerechoInferior.getX();
		float visy = verticeIzquierdoSuperior.getY();
		
		if (vdix == visy) {
			return false; //Crea una línea, no un cuadrado
		}
		
		if (vdix == 0 && visy == 0) {
			return false; //Crea una línea, no un cuadrado
		}
		
		if (this.base() != this.altura()) {
			return false; //Crea un rectangulo, no un cuadrado
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


