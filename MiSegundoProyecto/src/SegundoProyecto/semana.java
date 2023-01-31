package SegundoProyecto;
import java.util.Scanner;

public class semana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		System.out.print("Introduzca un numero del 1 al 7:");
		int dia= scanner.nextInt();
		switch(dia) {
		case 1-> System.out.println("Lunes");
		case 2->System.out.println("Martes");
		case 3->System.out.println("Miercoles");
		case 4->System.out.println("Jueves");
		case 5->System.out.println("Viernes");
		case 6->System.out.println("Sabado");
		case 7->System.out.println("Domingo");
		}
	}

}
