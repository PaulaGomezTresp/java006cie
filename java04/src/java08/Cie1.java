package java08;

import java.util.Scanner;

public class Cie1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Dame una nota");
		int nota=sc.nextInt();
		Alumno a=new Alumno(nota);
		System.out.println(a.imprimirNota());

	}

}
