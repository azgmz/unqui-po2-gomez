package videojuego;

public class Apagada extends Estado {

	@Override
	public boolean estaApagada() {
		return true;
	}

	@Override
	protected void esPrecionadoBotonDeInicio(int fichasInsertadas, MaquinaDeVideojuego maquina) {
		System.out.println("Encienda la maquina para poder jugar");
	}

}
