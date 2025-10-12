package ar.edu.unq;

public class Point {
	
	private float x;
	private float y;
	
	public Point(float x, float y) {
		
		this.x = x;
		this.y = y;
		this.setXY(x, y);
	}
	
	public Point() {
		
		this.x = 0f;
		this.y = 0f;
		this.setXY(x, y);
	}
	

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public void setXY(float x, float y) {
		this.setX(x);
		this.setY(y);
	}

	public Point sumarCon(Point unPunto) {
		
		float nuevoX = this.x + unPunto.getX();
		float nuevoY = this.y + unPunto.getY();
		
		return new Point(nuevoX, nuevoY);
	}
	
	
}
