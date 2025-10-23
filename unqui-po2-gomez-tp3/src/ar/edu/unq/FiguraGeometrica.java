package ar.edu.unq;

public abstract class FiguraGeometrica {
	protected float base;
	protected float altura;
	protected Point verticeIzquierdoSuperior;
    protected Point verticeDerechoInferior;
	
	protected FiguraGeometrica(Point visy, Point vdix) {
		 this.verticeIzquierdoSuperior = visy;
	     this.verticeDerechoInferior = vdix;
	     
	     this.base = Math.abs(visy.getX() - vdix.getX());
	     this.altura = Math.abs(vdix.getY() - visy.getY());
		
	     if (!esFiguraGeometrica()) {
	            throw new IllegalArgumentException("No es una figura geométrica");
	        }
	     
	}
	
	 public boolean esFiguraGeometrica() {
		    return base != 0 && altura != 0;
		    }
	
	public float area( ) {
		return base * altura; 
	}
	
	 public abstract float perimetro();
	 public abstract boolean esRectangulo();
	 public abstract boolean esCuadrado();
	 

}
