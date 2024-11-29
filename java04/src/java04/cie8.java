package java04;

public class cie8 {

	public static void main(String[] args) {
		String cadena="Hola, qué x tal estás?";
		int posición=0;
		for (int i=0;i<cadena.length();i++) {
			char letra=cadena.charAt(i);
			posición ++;
			if (letra=='x') {
				System.out.println(posición);
			}
		}
	}

}
