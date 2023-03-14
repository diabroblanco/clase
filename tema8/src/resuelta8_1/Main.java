package resuelta8_1;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		HoraExacta e=new HoraExacta(11, 15, 23);
		System.out.println(e);
		for(int i=1;i<=61;i++) {
			e.incrementar();
		}
		System.out.println(e);
		System.out.println("Escriba segundos");
		int segundos=sc.nextInt();
		if(e.setSegundos(segundos)) {
			System.out.println(e);
		}else {
			System.out.println("No es posible cambiar segundos");
		}
		HoraExacta a=new HoraExacta(1,2, 3);
		HoraExacta b=new HoraExacta(1, 2, 3);
		HoraExacta c=new HoraExacta(10, 20, 30);
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
	}

}
