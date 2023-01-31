package SegundoProyecto;
import java.util.Scanner;
public class numerocomprendido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Introduzca un numero entre 0 y 99999 ");
		int num= sc.nextInt();
		if(num < 0) {
			num=Math.abs(num);
		}
		if (num <10 && num > -10 ) {
			System.out.println("Tiene una cifra");
		} else if ( num < 100)  {
			System.out.println("Tiene dos cifras");
		} else if( num < 1000) {
			System.out.println("Tiene tres cifras");
		} else if (num < 10000) {
			System.out.println("Tiene cuatro cifras");
		} else if ( num < 100000) {
			System.out.println("Tiene cinco cifras");
		}

	}

}
