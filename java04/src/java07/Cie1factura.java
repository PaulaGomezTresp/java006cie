package java07;

public class Cie1factura {

	public static void main(String[] args) {
		Factura f=new Factura(25,287.36);
		
		System.out.println("Número de factura: "+f.getNumero());
		System.out.println("El importe sin IVA es: "+f.getImporte());
		System.out.println("El importe con IVA es: "+f.getcalcularIVA());
	}

}
