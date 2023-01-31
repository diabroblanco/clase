package main;
import java.util.Scanner;
public class Main {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Introduzca un numero: ");
		int a=sc.nextInt();
		System.out.print("Introduzca un numero: ");
		int b=sc.nextInt();
		System.out.println("Introduce numero: ");
		int c=sc.nextInt();
		System.out.println("El numero mayor es: " + maximo(a, b,c));
		

	}
	static int maximo(int a, int b, int c) {
		int aux=(maximo(a,b));
		
		return (maximo(aux, c));}
		
		static int maximo(int a, int b) {
			int max;
			if (a>b) {
				max=a;
			}else {
				max=b;
			}
			return(max);
}
	}