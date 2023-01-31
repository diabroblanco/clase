package SegundoProyecto;
import java.util.Locale;
import java.util.Scanner;
public class comidanimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Cuantos kilos de comida compras: ");
		double kilos=sc.nextDouble();
		System.out.print("Cuantos animales tienes: ");
		int animal=sc.nextInt();
		System.out.print("Cuanto come cada animal: ");
		double media=sc.nextDouble();
		if (animal == 0) {
			System.out.println("Que no hay animales"); }
		 
		if( kilos > animal*media) {
			 System.out.println("Hay suficiente comida");
		 } else {
			 System.out.println("No hay suficiente comida");
				 double racion = (kilos/media);
				 System.out.println("Tienen que comer"+ racion);
			 }
		 } 
		
	}


