package videojuego;

public class Jugando extends Estado {

	@Override
	protected void esPrecionadoBotonDeInicio(int fichasInsertadas,  MaquinaDeVideojuego maquina) {
		System.out.println("Ya se encuentra en partida");
	}

	@Override
	public boolean estaJugando() {
		return true;
	}

}
