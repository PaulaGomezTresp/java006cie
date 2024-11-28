package es.curso;

public class principal2 {

	public static void main(String[] args) {
	//DRY Dibt Repeat Yourself	
		int numero1=5;
		int numero2=7;
		int suma=5+7;
		System.out.println(suma);
		
		System.out.println("**********");
		
		int numero3=8;
		int numero4=9;
		int suma1=numero3+numero4;
		System.out.println(suma1);
		
	}
	
	public static int sumar(int n1, int n2) {
		int suma=n1+n2;
		return suma;
	}

}
