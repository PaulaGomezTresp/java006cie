package java06;

public class Bombilla {

	private int intensidad;

	public int getIntensidad() {
		return intensidad;
	}

	public void setIntensidad(int intensidad) {
		if (intensidad>=0 && intensidad<=3) {
			this.intensidad = intensidad;
		}
		if (intensidad < 0 || intensidad > 3)
			System.out.println("Valor no válido ");
	}

		public void incrementar() {
			setIntensidad(getIntensidad()+1);
				//intensidad++;			
	}
		

		public void decrementar() {
			setIntensidad(getIntensidad()-1);
				//intensidad--;			
	}
}
