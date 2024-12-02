package java05;

public class Cie3Factura {
		public static void main (String[] args) {
			
		Factura f =new Factura();
		f.importe=100;
		System.out.println(f.importe);
		System.out.println(f.calcularconIVA());
		System.out.println(f.calcularSoloIVA());
		}

}
