package src;

public class Producto {
	
	String nombre;
	double precio;
	boolean precioCuidado;
	
	public Producto(String nombre, double precio, boolean precioCuidado) {
		this(nombre, precio);
		this.precioCuidado = precioCuidado;
		
	}
	
	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean esPrecioCuidado() {
		return precioCuidado;
	}

	public void setPrecioCuidado(boolean precioCuidado) {
		this.precioCuidado = precioCuidado;
	}
	
	public void aumentarPrecio(double precio) {
		this.precio += precio;
	}
	
}
