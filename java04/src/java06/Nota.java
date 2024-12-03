package java06;

public class Nota {

	private double valor;

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		if (valor>=0 && valor<=10) {
			System.out.print("Tu nota es: ");
			this.valor = valor;}
		if (valor<0 || valor>10) 
			System.out.println("Nota no válida");
		
	}
	
	
	
		
}
