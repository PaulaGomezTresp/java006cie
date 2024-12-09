
public class Cie4 {

	public static void main(String[] args) {
		int [] lista=new int[] {4,26,48,30,21,3};
		int numeroMayor=0;
		for (int i=0;i<lista.length;i++) {
			
			if (numeroMayor<lista[i]) {
				numeroMayor=lista[i];
			}
			
		}System.out.println(numeroMayor);

	}

}
