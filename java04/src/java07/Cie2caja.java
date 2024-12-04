package java07;

public class Cie2caja {

	public static void main(String[] args) {
		Caja c=new Caja(2.13,5.14,7.35);
		System.out.println("Medida alto: "+c.getAlto());
		System.out.println("Medida ancho: "+c.getAncho());
		System.out.println("Medida fondo: "+c.getFondo());
		System.out.println("El volumen de la caja es: "+c.getvolumen());

		System.out.println("**************");
		
		Caja c1=new Caja(3.52,2.15,1.48);
		System.out.println("Medida alto: "+c1.getAlto());
		System.out.println("Medida ancho: "+c1.getAncho());
		System.out.println("Medida fondo: "+c1.getFondo());
		System.out.println("El volumen de la caja es: "+c1.getvolumen());
	}

}
