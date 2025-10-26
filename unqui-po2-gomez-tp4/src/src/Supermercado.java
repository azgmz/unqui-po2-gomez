package src;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {
	
	String nombre;
	String direccion;
	List<Producto> productos;
	
	public Supermercado(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.productos = new ArrayList<Producto>(); 
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public void agregarProducto(Producto prod) {
		
		this.productos.add(prod);
	}

	public Integer getCantidadDeProductos() {
		return this.productos.size();
	}
	
	public Double getPrecioTotal() {
		double total = 0;
		for(Producto producto : productos) {
			total+= producto.getPrecio();
		}
		return total;
	}
	
	
	
	
}
