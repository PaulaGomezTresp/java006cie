package es.curso;

public class principal13 {

	public static void main(String[] args) {
	
		
		Persona p1=new Persona();
		p1.edad=28;
		p1.nombre="Paula";
		p1.altura=1.57;
		
		Persona p2=new Persona();
		p2.edad=26;
		p2.nombre="Manu";
		p2.altura=1.73;
		
		Persona[] alumnos=new Persona[] {p1,p2};
	
		for (int i=0;i<alumnos.length;i++) {
			System.out.print("Nombre: "+alumnos[i].nombre);
			System.out.print("; Edad: "+alumnos[i].edad);
			System.out.println("; Altura: "+alumnos[i].altura);
		}
	}
	
	

	}


