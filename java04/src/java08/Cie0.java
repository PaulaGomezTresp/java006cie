package java08;

public class Cie0 {

	public static void main(String[] args) {
		String[] cadena=new String[] {"hola","que","tal","estais"};
	int i=0;
	int letras=0;
	int posicion=0;
	while (i<cadena.length) {		
		
			System.out.println(cadena[i]);
			System.out.println(cadena[i].length());	
			
			if(letras<cadena[i].length()) {
				letras=cadena[i].length();
				posicion=i;
			}
			i++;
		}
		System.out.println("El mayor número de letras por cadena es: "+ letras);
		System.out.println("La palabra más larga es: "+ cadena[posicion]);
			
	}
	}
	

		
	
	
		
		
		



