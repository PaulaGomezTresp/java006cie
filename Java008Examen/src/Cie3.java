
public class Cie3 {

	public static void main(String[] args) {
		String lista="hola me llamo pepe y soy informático";
		int numeroLetra=0;
		for (int i=0;i<lista.length();i++) {
			char letra=lista.charAt(i);
			if (letra=='e') {
				numeroLetra=numeroLetra+1;
			}
		}System.out.println(lista);
		System.out.println("Hay "+numeroLetra+" letras e.");
		
	}

}
