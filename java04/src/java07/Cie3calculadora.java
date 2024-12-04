package java07;

public class Cie3calculadora {

	public static void main(String[] args) {
		Calculadora mini=new Calculadora(5.41,2.3);
		
		System.out.println("El término a es: "+mini.getA());
		System.out.println("El término b es: "+mini.getB());
		System.out.println("La suma es: "+mini.sumar());
		System.out.println("La resta es: "+mini.resta());
		System.out.println("La multiplicación es: "+mini.multi());
		System.out.println("La división es: "+mini.divi());

	}

}
