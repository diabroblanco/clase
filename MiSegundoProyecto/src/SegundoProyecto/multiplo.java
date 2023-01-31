package SegundoProyecto;

import java.util.Scanner;

public class multiplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero1;
		int numero2;
		boolean resultado;
		Scanner entradaScanner=new Scanner(System.in);
		System.out.println("Indique el valor de numero1 ");
		numero1=entradaScanner.nextInt();
		System.out.println("Indique el valor de numero2 ");
		numero2=entradaScanner.nextInt();
		resultado= numero1 % numero2 == 0;
		System.out.println("*             Resultado            *");
		System.out.println("Los numeros "+numero1+ "  y  "  +numero2 +" son multiplos "+ resultado );
		

	}

}
