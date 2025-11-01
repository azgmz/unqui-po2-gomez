package videojuego;

public abstract class Estado {

	public boolean estaApagada() {
		return false;
	}
	
	public boolean estaEncendida() {
		return false;
	}

	protected abstract void esPrecionadoBotonDeInicio(int fichasInsertadas, MaquinaDeVideojuego maquina);

	public boolean estaJugando() {
		return false;
	}
	
}
