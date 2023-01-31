package SegundoProyecto;

import java.util.Scanner;

public class truefalsenumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		boolean resultado1, resultado2;
		Scanner entradaScanner=new Scanner(System.in);
		System.out.println("Escriba un numero");
		numero=entradaScanner.nextInt();
		resultado1=numero<0;
		resultado2=numero>0;
		System.out.println(" *************************** ");
	    System.out.println("*             Resultado            *");
	    System.out.println("El numero "+ numero + " es negativo " + "? "+ resultado1);
	    System.out.println("El numero "+ numero + " es positivo " + "? "+ resultado2);
				
		
		

	}

}
