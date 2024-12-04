package java07;

public class Factura {

		private int numero;
		private double importe;
		
		public int getNumero() {
			return numero;
		}
		public void setNumero(int numero) {
			this.numero = numero;
		}
		public double getImporte() {
			return importe;
		}
		public void setImporte(double importe) {
			this.importe = importe;
		}
		public Factura(int numero, double importe) {
			this.numero = numero;
			this.importe = importe;
		}

		public double getcalcularIVA () {
			return importe*1.21;
}	}
		

