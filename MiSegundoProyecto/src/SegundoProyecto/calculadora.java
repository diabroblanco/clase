package SegundoProyecto;
import java.util.Scanner;
// Calculadora de Adrián.

public class calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=0, b=0, operacion=0;
		String sel=null;
		System.out.print("Ingrese opcion \n");
		System.out.print("+: Suma "
				+ "\n-: Resta "
				+ "\n*: Multiplicación");
		sel=sc.next();
		
		switch(sel) {
		case "+":
			System.out.println("Ingrese primer numero: ");
			a=sc.nextInt();
			System.out.println("Ingrese segundo numero: ");
			b=sc.nextInt();
			operacion=a+b;
			System.out.println(a+b);
			break;
		case "-":
			System.out.println("Ingrese primer numero: ");
			a=sc.nextInt();
			System.out.println("Ingrese segundo numero: ");
			b=sc.nextInt();
			operacion=a-b;
			System.out.println(a-b);
			break;
		case "*":
			System.out.println("Ingrese primer numero: ");
			a=sc.nextInt();
			System.out.println("Ingrese segundo numero: ");
			b=sc.nextInt();
			operacion=a*b;
			System.out.println(a*b);
			break;
		default:
			System.out.println("No se puede hacer");
			
		}
	}

}
