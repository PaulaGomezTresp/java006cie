
public class Ordenador {

	private boolean estado;

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {			
		this.estado = estado;
	}
		
	public void encender() {
		estado=true;
}
	public void apagar() {
		estado=false;
	}
}
