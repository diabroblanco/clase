package SegundoProyecto;

import java.util.Scanner;

public class ifmayor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduzca un numero: ");
		int n1=sc.nextInt();
		System.out.println("Introduzca otro numero: ");
		int n2=sc.nextInt();
		if(n1>n2) {
			System.out.println(n1+ " es mayor que " +n2);
		} else {
			System.out.println(n2+ " es mayor que " +n1);
		}
		
				

	}

}
