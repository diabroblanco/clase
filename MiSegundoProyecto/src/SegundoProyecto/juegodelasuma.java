package SegundoProyecto;
import java.util.Scanner;
public class juegodelasuma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int solucion = 0;
		int n1 = (int) (Math.random()* 99 + 1);
		int n2 = (int) (Math.random()* 99 + 1);
		int operacion = (int) (Math.random()* 3 + 1);
		switch (operacion) {
		case 1:
			System.out.println(n1 + " + " + n2 + " ?: ");
			solucion = n1 + n2;
			break;
		case 2:
			System.out.println(n1 + " - " + n2 + " ?: ");
			solucion = n1 - n2;
			break;
		case 3:
			System.out.println(n1 + " * " + n2 + " ?: ");
			solucion = n1 * n2;
			break;
			
		}
		Scanner sc= new Scanner(System.in);
		System.out.print("Dime la respuesta -->");
		int respuesta = sc.nextInt();
		if ( respuesta != solucion) {
			System.out.println("Te has equivocado. Era : " + solucion);
		} else {
			System.out.println("Eres el cuchillo mas afilado de la cocina");
		}

	}

}
