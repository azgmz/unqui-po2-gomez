package ar.edu.unq;

public class PorcionMixta implements PorcionDeTierra {
	
	private PorcionPura porcion1;
	private PorcionPura porcion2;
	private PorcionPura porcion3;
	private PorcionPura porcion4;

	public PorcionMixta(PorcionPura porcion1, PorcionPura porcion2, PorcionPura porcion3, PorcionPura porcion4) {
		this.porcion1 = porcion1;
		this.porcion2 = porcion2;
		this.porcion3 = porcion3;
		this.porcion4 = porcion4;
	}
	
	public void plantar(Cultivo cultivo, PorcionPura unCuartoDePorcion) {
		if (unCuartoDePorcion.getCantidadDeCultivo() <= 25) {
			unCuartoDePorcion.plantar(cultivo);
		}
	}
	
	public boolean tienePlantado(Cultivo cultivo, PorcionPura unCuartoDePorcion) {
		return unCuartoDePorcion.tienePlantado(cultivo);
	}

	@Override
	public double gananciaAnualEstimada() {
		return porcion1.gananciaAnualEstimada() + porcion2.gananciaAnualEstimada() + porcion3.gananciaAnualEstimada() + porcion4.gananciaAnualEstimada();
	}
	
	public boolean contienePorcion(PorcionPura unCuartoDePorcion) {
		return (unCuartoDePorcion == porcion1)
				|| (unCuartoDePorcion == porcion2) 
				|| (unCuartoDePorcion == porcion3) 
				|| (unCuartoDePorcion == porcion4);
	}

}
