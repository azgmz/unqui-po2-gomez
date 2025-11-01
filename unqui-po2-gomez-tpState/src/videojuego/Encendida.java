package videojuego;

public class Encendida extends Estado {

	@Override
	protected boolean estaApagada() {
		return false;
	}

	@Override
	protected boolean estaEncendida() {
		return true;
	}

}
