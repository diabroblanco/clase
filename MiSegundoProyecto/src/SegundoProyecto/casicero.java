package SegundoProyecto;
import java.util.*;

public class casicero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		sc.useLocale(Locale.US);
		System.out.print("Introduzca un numero real positivo o negativo: ");
		double num = sc.nextDouble();
		if(-0.5 <num && num < 0.5 && num != 0) {
			System.out.println("Es un numero casi-cero");
		} else {
			System.out.println("No es un casi-cero");
		}

	}

}
