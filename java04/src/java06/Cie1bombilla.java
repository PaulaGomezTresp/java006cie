package java06;

import java.util.Scanner;

public class Cie1bombilla {

	public static void main(String[] args) {
		
		System.out.println("¿Cuál es la intensidad de la bombilla?");
		Scanner sc=new Scanner (System.in);
		
		Bombilla b1=new Bombilla();
		int numero=sc.nextInt();
		b1.setIntensidad(numero);
		System.out.println("es: "+b1.getIntensidad());
		
		b1.decrementar();
		System.out.println("decrementada es: "+b1.getIntensidad());
		b1.incrementar();
		System.out.println("incrementada es: "+b1.getIntensidad());
		
		Scanner close;

	}

}
