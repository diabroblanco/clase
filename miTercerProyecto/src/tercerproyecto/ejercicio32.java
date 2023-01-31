package tercerproyecto;
import java.util.Scanner;
public class ejercicio32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int sumaedad = 0;
		int numalumnos = 0;
		int contadorMayorEdad = 0;
		double media;
		System.out.print("Introduzca edad: ");
		int edad =sc.nextInt();
		while ( edad >= 0) {
			sumaedad += edad;
			numalumnos++;
			
			if (edad>= 18) {
				contadorMayorEdad++;
				
			}
			System.out.print("Introduzca edad: ");
			edad=sc.nextInt();
		}
		media = (double) sumaedad/numalumnos;
		
		System.out.println("Suma de tdas las edades: " + sumaedad);
		System.out.println("Media: " +media);
		System.out.println("Número total de alumnos: " +numalumnos);
		System.out.println("Mayores de edad: " +contadorMayorEdad);

	}

}
