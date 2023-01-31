package main;

import java.util.Scanner;

public class mejorado {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Escribe un numero: ");
		int a=sc.nextInt();
		System.out.print("Escribe un numero: ");
		int b=sc.nextInt();
		menu(a, b);

	}
	static void menu(int a, int b) {
		System.out.println("+-----------------------+");
		System.out.println("|    Calculadora Java   |");
		System.out.println("| 1.      Sumar         |");
		System.out.println("| 2.      Restar        |");
		System.out.println("| 3.    Multiplicar     |");
		System.out.println("| 4.      Dividir       |");
		System.out.println("+-----------------------+");
		System.out.println("     Indica tu opción    ");
		int opcion=sc.nextInt();
		switch(opcion) {
		case 1->{
			System.out.println(a+b);
		}
		case 2->{System.out.println(a-b);}
		case 3->{System.out.println(a*b);}
		case 4->{System.out.println((double)a/b);}
		default->{
		System.out.println("EEEEEEERROOOOOOOOOOR");
		menu(a, b);
		}
		}
		
	}

}
