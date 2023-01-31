package SegundoProyecto;
import java.util.*;
public class segundogrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		sc.useLocale(Locale.US);
		double a, b, c;
		double x1, x2, d;
		System.out.print("Introduzca primer coeficiente: " );
		a=sc.nextDouble();
		System.out.print("Introduzca segundo coeficiente: " );
		b=sc.nextDouble();
		System.out.print("Introduzca tercer coeficiente: " );
		c=sc.nextDouble();
		if (a==0) {
			System.out.println("No es una ecuacion de segundo grado" );
		} else {
			d=b*b - 4*a*c;
			if (d < 0) {
				System.out.println("No existen resultados Reales " );
			}else {
				x1 = (-b + Math.sqrt(d))/ (2 * a);
				x2= (-b - Math.sqrt(d))/(2 * a);
				System.out.println("Solución 1:  " + x1 );
				System.out.println("Solución 2:  " + x2 );
			}
			
		} 
			
		}

	}


