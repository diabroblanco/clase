package main;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Introduzca numero: ");
		int numero=sc.nextInt();
		eco(numero);
	}
static void eco(int a) {
	for (int i=0;i<a;i++) {
	System.out.println("Eco...");}
}
}
