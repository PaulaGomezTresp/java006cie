package java07;

public class Caja {

		private double alto;
		private double ancho;
		private double fondo;
		
		public double getAlto() {
			return alto;
		}
		public void setAlto(double alto) {
			this.alto = alto;
		}
		public double getAncho() {
			return ancho;
		}
		public void setAncho(double ancho) {
			this.ancho = ancho;
		}
		public double getFondo() {
			return fondo;
		}
		public void setFondo(double fondo) {
			this.fondo = fondo;
		}
		public Caja(double alto, double ancho, double fondo) {
			//setAlto(alto);
			this.alto = alto; 
			this.ancho = ancho;
			this.fondo = fondo;
		}
		public double getvolumen() {
			return alto*ancho*fondo;
		}
}
