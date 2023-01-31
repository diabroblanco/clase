package SegundoProyecto;

import java.util.Scanner;

public class numerodistinto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero1;
		int numero2;
		boolean resultado1;
		Scanner entradaScanner=new Scanner(System.in);
		System.out.println("Indique el valo de numero1 ");
		numero1=entradaScanner.nextInt();
		System.out.println("Indique el valo de numero2 ");
		numero2=entradaScanner.nextInt();
		resultado1=numero1 != numero2 || numero1  == 0 || numero2 == 0;
		System.out.println("***************************");
	    System.out.println("*             Resultado            *");
	    System.out.println("El numero1 "+ numero1 + " es distinto a numero2 o es 0 " + numero2+ "? " + resultado1);
	    

		

	}

}
