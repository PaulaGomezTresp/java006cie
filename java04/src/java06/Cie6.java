package java06;

public class Cie6 {

	public static void main(String[] args) {
		String cadena="hola amigos que tal estais";
		 for (int i=0;i<cadena.length();i++) {
		 	if (cadena.charAt(i)=='a' || cadena.charAt(i)=='e' || cadena.charAt(i)=='i' 
		 			|| cadena.charAt(i)=='o' || cadena.charAt(i)=='u')
		 	System.out.println(cadena.charAt(i));	
	}
	}
}
