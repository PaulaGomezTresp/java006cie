package es.curso;

public class principal6 {

	public static void main(String[] args) {
		//tengo un número 
		int numero1=2;
		
		cambiar(numero1);
		System.out.println(numero1);
	
	}	
	//la función cambia el valor del número por el número dado	
	//el número que entra es una copia del número que teníamos 
	//es una nueva variable
	public static void cambiar(int n1) {
			n1=7;
			System.out.println("cambiado "+ n1);
			
		}
	}

