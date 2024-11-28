package es.curso;

public class principal3 {

	public static void main(String[] args) {
	//DRY Dibt Repeat Yourself	
		int numero1=7;
		int numero2=5;
		int suma=5+7;
		System.out.println("El resultado de la suma es:"+sumar(numero1,numero2));
		
		System.out.println("**********");
		
		System.out.println("El resultado de la resta es:"+restar(numero1,numero2));
		
		System.out.println("**********");
		
		int numero3=9;
		int numero4=8;
		
		System.out.println("El resultado de la suma es:"+sumar(numero3,numero4));
		
		System.out.println("************");
		
		System.out.println("El resultado de la resta es:"+restar(numero3,numero4));
	}
	//Todo lo que metes aquí se repite cada vez que lo utilices
	public static int sumar(int n1, int n2) {
		
		int suma=n1+n2;
		return suma;
	}
	public static int restar(int n1,int n2) {
		int resta=n1-n2;
		return resta;
	}

}
