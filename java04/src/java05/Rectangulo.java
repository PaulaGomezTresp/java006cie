package java05;

public class Rectangulo {

		private double largo;
		private double ancho;
		
		//get es obtener
		public double getLargo() {
			return largo;
		}
		//set es asignar
		public void setLargo(double largo) {
			if(largo>0)
			this.largo = largo;
		}
		public double getAncho() {
			return ancho;
		}
		public void setAncho(double ancho) {
			if (ancho>0)
			this.ancho = ancho;
		}
		
		
		public double area() {
				return largo*ancho;
		}
		public double perimetro() {
			return (2*largo)+(2*ancho);
		}
		
}
