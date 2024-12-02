package java05;

public class Factura {
	public double importe;
	
	public double calcularconIVA () {
		//quitamos el double importe porque accedemos a la propiedad
		return importe*1.21;
	}
		
	public double calcularSoloIVA () {
		return importe*0.21;
	}
}
