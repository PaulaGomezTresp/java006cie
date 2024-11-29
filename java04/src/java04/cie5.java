package java04;

public class cie5 {

	public static void main(String[] args) {
		String[] lista= new String[] {"Hola","qué","tal","estás"};
		
		//Haces el bucle para que pase de palabra en palabra
		for (int i=0;i<lista.length;i++) {
			//el Bucle para que coja cada letras de cada palabra
			for (int j=0;j<lista[i].length();j++) {
			char caracter=lista[i].charAt(j);
			System.out.println(caracter);
			
			}
			//dejamos una línea en blanco
			System.out.println();
		}

	}}


