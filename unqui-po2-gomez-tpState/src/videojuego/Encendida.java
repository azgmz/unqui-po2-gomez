package videojuego;

public class Encendida extends Estado {

	@Override
	public boolean estaEncendida() {
		return true;
	}

	@Override
	protected void esPrecionadoBotonDeInicio(int fichasInsertadas, MaquinaDeVideojuego maquina) {
		if (fichasInsertadas == 0) {
			System.out.println("Inserte una ficha para un jugador. Inserte dos fichas para dos jugadores");
		}else if (fichasInsertadas == 1) {
			System.out.println("Comenzando juego de un jugador");
			maquina.jugando();
		}else if (fichasInsertadas >= 2) {
			System.out.println("Comenzando juego de dos jugadores");
			maquina.jugando();
		}

	}

}
