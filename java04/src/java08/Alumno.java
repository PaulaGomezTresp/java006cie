package java08;

public class Alumno {

	private int nota;

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		if(nota>=0 && nota<5) 
			System.out.println("Suspenso");
		if (nota == 5)
			System.out.println("Aprobado");
		if (nota ==6)
			System.out.println("Bien");
		if (nota==7 || nota==8)
			System.out.println("Notable");
		if (nota==9 || nota==10)
			System.out.println("Sobresaliente");
		if (nota<0 || nota>10)
			System.out.println("Valor no válido");
		this.nota=nota;
	}

	public Alumno(int nota) {
		setNota (nota);
	}
	
	public int imprimirNota() {
		return nota;
			
		
	}
	
	
}

