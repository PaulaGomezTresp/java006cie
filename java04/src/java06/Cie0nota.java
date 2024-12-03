package java06;

import java.util.Scanner;

public class Cie0nota {

	public static void main(String[] args) {
	System.out.println("Dime tu nombre");
	Scanner sc=new Scanner(System.in);
	String nombre=sc.next();
	System.out.println("Dame la nota");
	Nota nota1=new Nota();
	double numero=sc.nextDouble();
	nota1.setValor(numero);
	System.out.println(nota1.getValor());

	Scanner close;
	}

}
