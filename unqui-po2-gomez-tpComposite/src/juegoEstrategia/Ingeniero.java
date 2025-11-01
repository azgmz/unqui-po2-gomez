package juegoEstrategia;

public class Ingeniero {

	private int cantidadDeLajas;
	private int x;
	private int y;
	
	public Ingeniero(int cantidadDeLajas, int x, int y) {
		this.cantidadDeLajas = cantidadDeLajas;
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}
	

	public void caminarHasta(int x, int y) {
		setX(x);
		setY(y);
	}
	
}
