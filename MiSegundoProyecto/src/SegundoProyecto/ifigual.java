package SegundoProyecto;
import java.util.Scanner;

public class ifigual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Introduzca un numero:  ");
		int n1= sc.nextInt();
		System.out.print("Introduzca otro numero");
		int n2= sc.nextInt();
		if(n1==n2) {
			System.out.println(n1+ " es igual que "+ n2);
		} else {
			System.out.println(n1+ " y " +n2+ " son numeros distintos");
		}
		
				
				 

	}

}
