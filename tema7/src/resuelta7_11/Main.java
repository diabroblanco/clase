package resuelta7_11;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Lista lista1= new Lista();
		Lista lista2=new Lista();
		
		for(int i=0;i<6;i++) {
			System.out.println("Escribe un digito");
			lista1.Principio(sc.nextInt());
		}
		lista1.mostrar();
		System.out.println("En que posicion está el numero que quieres eliminar");
		lista1.eliminar(sc.nextInt());
		lista1.mostrar();	
		System.out.println("En que posicion está el numer oque quieres buscar");
		System.out.println("El numero es " +lista1.buscar(sc.nextInt()));
		lista1.mostrar();
		System.out.println("Qué numero quieres meter en la lista");
		lista1.insertar(0, sc.nextInt());
		lista1.mostrar();
		for(int i=0;i<3;i++) {
			System.out.println("Escribe un digito");
			lista2.Final(sc.nextInt());}
		lista2.mostrar();
		lista1.Final(lista2);
		lista1.mostrar();
	}

}
