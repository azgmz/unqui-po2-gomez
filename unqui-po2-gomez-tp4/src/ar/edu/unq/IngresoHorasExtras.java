package ar.edu.unq;

public class IngresoHorasExtras extends Ingreso{

	private int horasExtras;
	
	public IngresoHorasExtras(String mes, String concepto, double monto, int horasExtras) {
		super(mes, concepto, monto);
		this.horasExtras = horasExtras;
	}
	
	public int getHorasExtras() {
		return horasExtras;
	}
	
	public double montoImponible() {
		return 0d;
	}

}
