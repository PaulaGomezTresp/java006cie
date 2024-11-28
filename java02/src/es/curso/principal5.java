package es.curso;

public class principal5 {

	public static void main(String[] args) {
		// DRY Dibt Repeat Yourself

		int numero1 = 9;
		int numero2 = 8;
		int numero3 = 3;

		System.out.println("El resultado de la suma es:" + sumar(numero1, numero2, numero3));
		System.out.println("**********");
		System.out.println("La multiplicación da:" + multi(numero1, numero2));
		System.out.println("**********");

		int numero4 = 15;
		int numero5 = 5;
		int numero6 = 7;

		System.out.println("El resultado de la resta es:" + restar(numero4, numero5, numero6));
		System.out.println("**********");
		System.out.println("La división da:" + divi(numero4, numero6, numero5));
		System.out.println("**********");
		System.out.println(sumaNterminos(6));
	}

	// Todo lo que metes aquí se repite cada vez que lo utilices
	public static int sumar(int n1, int n2, int n3) {

		int suma = n1 + n2 + n3;
		return suma;
		// En algunos quita el int, deja solo el return
	}

	public static int restar(int n1, int n2, int n3) {
		int resta = n1 - n2 - n3;
		return resta;
	}

	public static int multi(int n1, int n2) {
		int por = n1 * n2;
		return por;
	}

	public static double divi(double n1, double n2, double n3) {
		double entre = n1 / n2 / n3;
		return entre;
	}

	// para sumas más grandes, de n términos
	public static int sumaNterminos(int n) {
		int suma = 0;
		for (int i = 0; i < n; i++) {
			suma = suma + i;
		}
		return suma;
	}
}
