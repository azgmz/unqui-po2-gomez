package ar.edu.unq;

public class PorcionPura implements PorcionDeTierra{

	private Cultivo cultivoPermitido;
	private int cantidadDeCultivo;
	
	public PorcionPura(Cultivo cultivoPermitido) {
		this.cultivoPermitido = cultivoPermitido;
		this.cantidadDeCultivo = 0;
	}
	
	public void plantar(Cultivo cultivo) {
		if (cultivo == cultivoPermitido) {
			if (cantidadDeCultivo >= 100) {
	            throw new IllegalArgumentException("No se pueden plantar más de 100 cultivos");
	        }
			cantidadDeCultivo++;
			}
	}
		 
	public boolean tienePlantado(Cultivo cultivo) {
		return cultivo == cultivoPermitido;
	}

	public int getCantidadDeCultivo() {
		return cantidadDeCultivo;
	}

	@Override
	public double gananciaAnualEstimada() {
		return 12 * cultivoPermitido.getPrecioUnitario() * cantidadDeCultivo;
	}


}
