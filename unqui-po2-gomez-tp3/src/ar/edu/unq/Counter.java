package ar.edu.unq;

import java.util.ArrayList;
import java.util.List;

public class Counter {
	
	private List<Integer> numeros;
	
	public Counter() {
		this.setNumeros(new ArrayList<>());
	}

	public List<Integer> getNumeros() {
		return numeros;
	}

	public void setNumeros(List<Integer> numeros) {
		this.numeros = numeros;
	}
	
	public void agregarNumero(int numero) {
		this.numeros.add(numero);
	}
	
	public int cantidadDePares() {
		int count = 0;
		for (int n : numeros) {
			if (n % 2 == 0) {
				count++;
			}
		}
		return count;
	}
	
	public int cantidadDeImpares() {
		int count = 0;
		for (int n : numeros) {
			if (n % 2 != 0) {
				count++;
			}
		}
		return count;
	}
	
	 public int cantidadDeMultiplosDe(int divisor) {
		 int count = 0;
		 for (int n : numeros) {
			 if (n % divisor == 0) {
				 count++;
			 }
		 }
		 return count;
	 }
	
	 public List<Integer> desglosandoALista(int numero) {
		 List<Integer> digitos = new ArrayList<>();

		    if (numero == 0) {
		        digitos.add(0);
		        return digitos;
		    }

		    while (numero > 0) {
		        int digito = numero % 10;
		        digitos.add(0, digito);
		        numero = numero / 10;
		    }

		    return digitos;
		}
}