package tercerproyecto;
import java.util.Scanner;

public class cines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Cuantas entradas quieres");
		int entradas=sc.nextInt();
		System.out.print("Cuantos adultos: ");
		int adultos=sc.nextInt();
		System.out.print("Cuantos niños: ");
		int peques=sc.nextInt();
		int precioa=6*adultos;
		int precion=4*peques;
		int total=precioa +precion;
		
		if (entradas>1) {

			System.out.println("El total es: " +total+ " euros ");
			System.out.println(" Elijamos pelicula ");
		System.out.println(" ------------------------- ");
		System.out.println(" Elige pelicula \n"
				+"\n 1 Avatar"
				+"\n 2 Gato con botas"
				+"\n 3 A man Called Otto");
		
		System.out.println("**************");
		
		int pelicula=sc.nextInt();
		switch (pelicula){
		case 1->
		System.out.println(" Avatar la forma del agua "  +" son "+ entradas +" entradas  " + total + " € ");
		case 2->
		System.out.println("El Gato con botas" +" son "+ entradas +" entradas " + total + " € ");
		case 3->
		System.out.println("A Man Called Otto" +" son "+ entradas +" entradas " + total+ " € ");
		default->
		System.out.println("ERROR");}
		
		if (pelicula ==3 && peques>=1) {
		System.out.println("No es apta para menores");}
		else {
		
		System.out.println("QUIERES CONTINUAR LA COMPRA? \n"
				+"\n 1 Si"
				+ "\n 2 No");
		int respuesta=sc.nextInt();
		switch(respuesta){
		
		case 1->
		System.out.println("Compra Finalizada \n"
				+ "\n** "+entradas+" entradas por "+total+ " €**"
				+ "\n  **Cines Adrián**");
		
		case 2->
		System.out.println("Compra cancelada");}
		
		}
	}
}
}
