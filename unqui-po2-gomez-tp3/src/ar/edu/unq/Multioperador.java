package ar.edu.unq;

import java.util.ArrayList;
import java.util.List;

public class Multioperador {

	public static int sumarTodos(List<Integer> lista) {
		int suma = 0;
		for (int n : lista ) {
			suma += n;
		}
		
		return suma;
	}

	public static int restarTodos(ArrayList<Integer> lista) {
		if (lista.isEmpty()) return 0;
		
		int resta = lista.get(0);
		
		for (int i = 1; i < lista.size(); i++) {
			resta -= lista.get(i);
		}
		return resta;
	}

	public static int multiplicarTodos(ArrayList<Integer> lista) {
		if (lista.isEmpty()) return 0;
		
		int mul = lista.get(0);
		
		for (int i = 1; i < lista.size(); i++) {
			mul *= lista.get(i);
		}
		return mul;
	}
}
