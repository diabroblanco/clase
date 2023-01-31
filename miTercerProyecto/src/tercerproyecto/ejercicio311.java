package tercerproyecto;
import java.util.Scanner;
public class ejercicio311 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double factorial;
		int numero;
		System.out.print("Escribe un número, deprisa: ");
		numero=sc.nextInt();
		factorial=1;
		//for(int i=numero;i>0;i--) {
			//factorial=factorial * i;
		while  (numero >0) {
			factorial= factorial* numero;
			numero--;
		}
		System.out.println("El factorial de " + numero+ " es: " + factorial);
	}

}
