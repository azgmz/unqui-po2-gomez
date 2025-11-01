package juegoEstrategia;

import java.util.List;
import java.util.ArrayList;

public class Mapa {
	
	private int alturaMaxima;
	private int largoMaximo;
	private List<ObjetoEnMapa> objetosEnMapa;

	public Mapa(int alturaMaxima, int largoMaximo) {
		this.alturaMaxima = alturaMaxima;
		this.largoMaximo = largoMaximo;
		this.objetosEnMapa = new ArrayList<ObjetoEnMapa>();
	}

	public int getAlturaMaxima() {
		return alturaMaxima;
	}

	public int getLargoMaximo() {
		return largoMaximo;
	}

}
