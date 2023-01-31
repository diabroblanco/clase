package SegundoProyecto;

import java.util.Scanner;

import javax.lang.model.element.Element;

public class RepasoOperandoBooleanos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero1;
		int numero2;
		boolean resultado1, resultado2, resultado3;
		Scanner entradaScanner=new Scanner(System.in);
		System.out.println("Indique el valo de numero1 ");
		numero1=entradaScanner.nextInt();
		System.out.println("Indique el valo de numero2 ");
		numero2=entradaScanner.nextInt();
		resultado1=numero1>numero2;
		resultado2=numero1<numero2;
		resultado3=numero1==numero2;
	    System.out.println("***************************");
	    System.out.println("*             Resultado            *");
	    System.out.println("El numero1 "+ numero1 + " es mayor que numero2 " + numero2+ "? " + resultado1);
	    System.out.println("El numero1 "+ numero1 + " es menor que numero2 " + numero2+ "? " + resultado2);
	    System.out.println("El numero1 "+ numero1 + " es igual que numero2 " + numero2+ "? " + resultado3);
	}

}
