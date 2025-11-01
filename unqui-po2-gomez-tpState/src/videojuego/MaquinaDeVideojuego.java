package videojuego;

public class MaquinaDeVideojuego {

	private Estado estado;
	private int fichasInsertadas;
	
	public MaquinaDeVideojuego() {
		this.estado = new Apagada();
		this.fichasInsertadas = 0;
	}
	
	public boolean estaApagada() {
		return estado.estaApagada();
	}

	public void encender() {
		estado = new Encendida();
	}

	public void esPrecionadoBotonDeInicio() {
		estado.esPrecionadoBotonDeInicio(fichasInsertadas, this);
	}

	public void insertarFicha() {
		fichasInsertadas++;
	}

	public void terminarJuego() {
		fichasInsertadas = 0;
		estado = new Apagada();
	}

	public boolean estaEncendida() {
		return estado.estaEncendida();
	}

	public int getfichasInsertadas() {
		return fichasInsertadas;
	}

	public boolean estaJugando() {
		return estado.estaJugando();
	}

	public void jugando() {
		estado = new Jugando();
	}
}
