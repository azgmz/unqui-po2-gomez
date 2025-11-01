package juegoEstrategia;

public class ObjetoEnMapa {

	private int x;
	private int y;
	private boolean hayLaja;
	
	public ObjetoEnMapa(int x, int y, boolean hayLaja) {
		this.x = x;
		this.y = y;
		this.hayLaja = false;
	}

	public boolean hHayLaja() {
		return hayLaja;
	}

	public void agregarLaja() {
		this.hayLaja = true;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
}
