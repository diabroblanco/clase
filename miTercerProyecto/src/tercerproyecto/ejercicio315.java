package tercerproyecto;
import java.util.Scanner;
public class ejercicio315 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Escriba un numero: ");
		int numero =sc.nextInt();
		for (int fila = 1; fila<=numero; fila++) {
			for( int ast = fila; ast<= numero; ast++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}

}
