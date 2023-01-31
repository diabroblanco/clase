package tercerproyecto;
import java.util.Scanner;
public class ejercicio38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int numero;
		int suma= 0;
		double media;
		for (int i=1; i<=10; i++) {
			System.out.println("Escriba un número: ");
			numero=sc.nextInt();
			suma +=numero;
		}
		media = suma/10;
		System.out.println("TOMA TU MEDIA: " + media);

	}

}
