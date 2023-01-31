package SegundoProyecto;

import java.util.Scanner;

public class muestracase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=10;
		System.out.print("Introduce un numero");
		a=sc.nextInt();
		switch (a-2) {
		case 1: 
			System.out.print("Hola");
			break;
		case 5:
			System.out.print("Me");
			break;
		case 8:
			System.out.print("Alegro");
			break;
		case 9:
			System.out.print("De");
			break;
		case 11:
			System.out.print("Conocerte");
			break;
		default:
			System.out.print("Sin coincidencia");
			
			
		}

	}

}
