package SegundoProyecto;
import java.util.Scanner;

public class notas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int nota;
		System.out.print("Dime tu nota ");
		nota=sc.nextInt();
		switch (nota) {
		case 0,1,2,3,4 -> {
			System.out.println("Suspenso ");
			System.out.println("Haber estudiao");
		}
		case 5 -> {
			System.out.println("Aprobado raspado");
		}
		case 6 -> {
			System.out.println("Podría ser mejor");
		}
		case 7,8 -> {
			System.out.println("Está bien pero eres capaz de más");
		}
		case 9,10 -> {
			System.out.println("Está muy bien");
			System.out.println("No bajes de ahí");
		}
		default ->
		System.out.println("Nota incorrecta");
		}
		
	}

}
