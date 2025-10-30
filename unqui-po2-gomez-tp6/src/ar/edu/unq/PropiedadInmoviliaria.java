package ar.edu.unq;

public class PropiedadInmoviliaria {

	private String descripcion;
	private String direccion;
	private double valorFiscal;
	
	public PropiedadInmoviliaria(String descripcion, String direccion, double valorFiscal) {
		this.descripcion = descripcion;
		this.direccion = direccion;
		this.valorFiscal = valorFiscal;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public String getDireccion() {
		return direccion;
	}

	public double getValorFiscal() {
		return valorFiscal;
	}
}
