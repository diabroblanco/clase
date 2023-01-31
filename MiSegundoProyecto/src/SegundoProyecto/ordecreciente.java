package SegundoProyecto;
import java.util.Scanner;

public class ordecreciente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n1, n2;
		System.out.print("Introduzca un numero: ");
		n1=sc.nextInt();
		System.out.print("Introduzca otro numero: ");
		n2=sc.nextInt();
		if(n1== n2 ) {
			System.out.println("Son iguales");
		} else {
			if (n1>n2) {
				System.out.println(n1 + " es mayor que " +n2);
			} else {
				System.out.println(n2+ " es mayor que " + n1);
			}
		}

	}

}
