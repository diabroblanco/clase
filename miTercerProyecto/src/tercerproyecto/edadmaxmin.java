package tercerproyecto;
import java.util.Scanner;
public class edadmaxmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int max, min, edad;
		System.out.print("Escribe edad(0 para salir): ");
		edad=sc.nextInt();
		max=edad;
		min=edad;
		
		while (edad!=0) {
			if(max<edad) {
				max=edad;
			}
			if(min>edad) {
				min=edad;
			}
			System.out.println("Indique otra edad: ");
			edad=sc.nextInt();
		}
		System.out.println("Edad máxima escrita es: "+ max);
		System.out.println("Edad mínima escrita es: "+ min);

	}

}
