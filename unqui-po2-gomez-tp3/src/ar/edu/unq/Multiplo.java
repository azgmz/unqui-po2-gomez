package ar.edu.unq;

public class Multiplo {
	
	public static int maxMultiploEntre0Y1000(int x, int y) {
		int mcm = minimoComunMultiplo(x, y);
		
		if (mcm > 1000) {
			return -1;
		}
		return (1000 / mcm) * mcm;
	}
	
	private static int maximoComunDivisor(int x, int y) {
		while (y != 0) {
			int temp = y;
			y = x % y;
			x = temp;
		}
	return x;
	}
	
	private static int minimoComunMultiplo(int x, int y) {
		return (x * y) / maximoComunDivisor(x, y);
	}
}