package main;
import java.util.Scanner;
public class Main {
static int maximo(int a, int b) {
	int max;
	if (a>b) {
		max=a;
	}else {
		max=b;
	}
	return(max);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Introduzca un numero: ");
		int a=sc.nextInt();
		System.out.print("Introduzca un numero: ");
		int b=sc.nextInt();
		System.out.println("El numero mayor es: " + maximo(a, b));

	}

}
