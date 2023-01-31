package SegundoProyecto;
import java.util.Scanner;
public class mes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Escriba un mes( del 1 al 12): ");
		int mes= new Scanner(System.in).nextInt();
		int dias = switch (mes){
		case 1,3,5,7,8,10,12 -> {
		yield 31;
		}
		case 2 -> {
			yield 28;
		}
		case 4, 6 ,9 ,11 -> {
			yield 30;
		}
		default ->{
			System.out.println("Estás seguro que tiene tantos meses?");
			yield -1;
			
		}
		};
		System.out.println("Días: " + dias);

	}

}
