package tercerproyecto;
import java.util.Scanner;
public class ejercicio33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int secreto = (int) (Math.random() * 100 + 1);
		System.out.print("Entre 1 y 100 que número estoy pensando (para dejar de intentarlo pon -1) : ");
		int numero=sc.nextInt();
		while (secreto != numero && numero != -1) {
			if (secreto <numero) {
				System.out.println("Quita números");
			} else {
				System.out.println("Súmale números");
			}
			System.out.print("Introduzca otro número: ");
			numero=sc.nextInt();
		}
			if(secreto == numero) {
				System.out.println("Lo has conseguido por cabezota");
			} else {
				System.out.println("Cuanto tiempo has perdido?");
			}
	}

}
