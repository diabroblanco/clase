package tercerproyecto;
import java.util.Scanner;
public class ejercicio310 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double suma = 0;
		for (int i =1; 1<=10; i++) {
			int impar=2*i-1;
			suma+= impar;
			if (suma ==100) break;
		}
		System.out.println("La suma de los 10 primero numeros impares es: " + suma);
	}

}
