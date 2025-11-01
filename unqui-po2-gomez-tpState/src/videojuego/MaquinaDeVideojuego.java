package videojuego;

public class MaquinaDeVideojuego {

	private Estado estado;
	
	public MaquinaDeVideojuego() {
		this.estado = new Apagada();
	}
	
	public boolean estaApagada() {
		return estado.estaApagada();
	}

	public void encender() {
		estado = new Encendida();
	}

	public void esPrecionadoBotonDeInicio() {
		if (estado.estaEncendida()) {
			System.out.println("Inserte una ficha para un jugador. Inserte dos fichas para dos jugadores");
		}
	}
}
