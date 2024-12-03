package java06;

import java.util.Scanner;

public class Cie2bombilla {

	public static void main(String[] args) {
		
		
		Bombilla b1=new Bombilla();
		b1.incrementar();
		b1.incrementar();
		b1.decrementar();
		System.out.println("La intensidad de la bombilla es: "+b1.getIntensidad());
		b1.decrementar();
		b1.decrementar();
		System.out.println("La intensidad de la bombilla es: "+b1.getIntensidad());

	}

}
