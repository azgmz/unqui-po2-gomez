package videojuego;

public class MaquinaDeVideojuego {

	private Estado estado;
	
	public MaquinaDeVideojuego() {
		this.estado = new Apagada();
	}
	
	public boolean estaApagada() {
		return estado.estaApagada();
	}
}
