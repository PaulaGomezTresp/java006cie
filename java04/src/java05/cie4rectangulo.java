package java05;

public class cie4rectangulo {

	public static void main(String[] args) {
		Rectangulo r1=new Rectangulo();
		r1.setLargo(7.25);
		r1.setAncho(4.68);
		
		Rectangulo r2=new Rectangulo();
		r2.setLargo(8.25);
		r2.setAncho(3.15);

		Rectangulo r3=new Rectangulo();
		r3.setLargo(4.25);
		r3.setAncho(1.36);
		
		Rectangulo r4=new Rectangulo();
		r4.setLargo(8.14);
		r4.setAncho(5.98);
		
		Rectangulo[] lista=new Rectangulo[] {r1,r2,r3,r4};
		
		double suma=0;
		double sumap=0;
		for (int i=0;i<lista.length;i++) {
			System.out.println("Área: "+lista[i].area());
			suma=suma+lista[i].area();
			System.out.println("Perímetro: "+lista[i].perimetro());
			sumap=sumap+lista[i].perimetro();
			System.out.println("************");
;		}
		
		System.out.println("La suma de las áreas es: "+suma);
		System.out.println("La suma de los perímetros es: "+sumap);
	}

}
