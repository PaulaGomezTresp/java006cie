package es.curso;

public class principal11 {

	public static void main(String[] args) {
	
		
		int[] lista= new int[] {2,5,6,7}; 
		int suma=0;
		
		for (int i=0;i<lista.length;i++) {
			System.out.println(lista[i]);
			//suma+=lista[i] es lo mismo
			suma=suma+lista[i];
			
		}
		System.out.println("***********");
		System.out.println(sumaNterminos(lista));
	}
	public static int sumaNterminos(int[] miArray) {
		int suma=0;
		for (int i=0;i<miArray.length;i++) {
			suma=suma+miArray[i];
		}
		return suma;
	
	}

	}


