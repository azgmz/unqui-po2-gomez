package ar.edu.unq;

public class Cuadrado extends FiguraGeometrica {
	
	public Cuadrado(Point verticeIzquierdoSuperior, Point verticeDerechoInferior) {
		super(verticeIzquierdoSuperior, verticeDerechoInferior);
		
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
		
		if (base != altura) {
			return false; //Crea un rectangulo, no un cuadrado
		}
		
		return true;
	}

	public float perimetro() {
		return base * 4;
	}

	public boolean esRectangulo() {
		return false;
	}
	
}


