package java04;

public class cie6 {

	public static void main(String[] args) {
		String cadena="Hola, qué tal estás?";
		int NumeroVeces=0;
		
		for (int i=0;i<cadena.length();i++) {
			char caracter=cadena.charAt(i);
			
			if (caracter=='a'|| caracter=='á') {
				NumeroVeces++;
				
			}
				
		}
		System.out.println(NumeroVeces);
	}

}
