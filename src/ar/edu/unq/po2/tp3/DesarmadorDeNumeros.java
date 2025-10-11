package src.ar.edu.unq.po2.tp3;

import java.util.List;

public class DesarmadorDeNumeros {
	
	private List<Integer> listaDeNumeros;
	
	public DesarmadorDeNumeros(List<Integer> numeros) {
        this.listaDeNumeros = numeros;
    }
	
	private int cantidadDeDigitosPares(int numero) {
		int n = numero;
		if (n == 0) return 1;
		int count = 0;
		while (n > 0) {
			int digito = (int) (n % 10);
			if (digito % 2 == 0) {
				count++;
			}
			numero /= 10;
		}
		return count;
	}

	public int numeroConMasDigitosPares() {
		int mejorNumero = listaDeNumeros.get(0);
		int maxPares = cantidadDeDigitosPares(mejorNumero);
		
		for (int i = 1; i < listaDeNumeros.size(); i++) {
			int numeroAComparar = listaDeNumeros.get(i);
			int pares = cantidadDeDigitosPares(numeroAComparar);
			if (pares > maxPares) {
				maxPares = pares;
				mejorNumero = numeroAComparar;
			}
		}
		return mejorNumero;
	}
	
}