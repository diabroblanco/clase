package tercerproyecto;
import java.util.Scanner;
public class ejercicio312 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		boolean cateados = false;
		for (int i =0; i<5; i++) {
			System.out.print("Introduzca notas (de 0 a 10)");
			int notas=sc.nextInt();
			if (notas <5) {
			cateados = true;
		}
		}
		if (cateados ) {
			System.out.println("Hay alumnos suspensos"); 
		} else {
			System.out.println("No hay suspensos");
		}
	}

}
