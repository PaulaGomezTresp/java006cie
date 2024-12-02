package java05;

import java04.Persona;

public class Cie1 {
public static void main(String[] args) {
	Persona p1=new Persona();
	p1.edad=20;
	p1.nombre="Paula";
	
	Persona p2=new Persona();
	p2.edad=5;
	p2.nombre="Laura";
	
	Persona[] lista=new Persona[] {p1,p2};
	
	double suma=0;
	int vueltas=0;
	for (int i=0;i<lista.length;i++) {
		System.out.print(lista[i].nombre+": ");
		System.out.println(lista[i].edad);
		suma=suma+lista[i].edad;
		vueltas++;
		
	}
	double media=suma/vueltas;
	System.out.println("La suma de las edades es: "+suma);
	System.out.println("La media de las edades es: "+media);
}
}
