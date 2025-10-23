package ar.edu.unq;

public class Rectangulo extends FiguraGeometrica {

	public Rectangulo(Point verticeIzquierdoSuperior, Point verticeDerechoInferior) {
		super(verticeIzquierdoSuperior, verticeDerechoInferior);
		
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
		
		if (base == altura) {
			return false; //Crea un cuadrado, no un rectangulo
		}
		
		return true;
	}

	public float perimetro() {
		
		return (2 * (base + altura));
	}

	public boolean esVertical() {
		if (altura > base) {
			return true;
		}
		return false;
	}

	public boolean esHorizontal() {
		if (base > altura) {
			return true;
		}
		return false;
	}
	
	public boolean esCuadrado() {
		return false;
	}
	
}
