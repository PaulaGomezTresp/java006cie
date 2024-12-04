package java07;

import java.util.Scanner;

public class Cie4calculadoraregular {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Dame el primer término");
		double n1=sc.nextDouble();
		System.out.println("Dame el segundo término");
		double n2=sc.nextDouble();
		System.out.println("La suma es: "+Calculadoraregular.sumar(n1, n2));
		System.out.println("La resta es: "+Calculadoraregular.restar(n1, n2));
		System.out.println("La multiplicación es: "+Calculadoraregular.multi(n1, n2));
		System.out.println("La división es: "+Calculadoraregular.divi(n1, n2));
		System.out.println("La potencia de 9 al cubo es: "+Math.pow(n1, n2));
		
	}
	Scanner close;

}
