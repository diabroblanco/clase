package main;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Introduce primer numero: ");
		int a=sc.nextInt();
		System.out.print("Introduce segundo numero: ");
		int b=sc.nextInt();
		mostrar(a, b);

	}
	static void mostrar(int a, int b) {
		int mayor=a >b?a:b;
		int menor=a<b?a:b;
		for( int i=menor; i <=mayor; i++) {
			System.out.println(i);
		}
	}
}
