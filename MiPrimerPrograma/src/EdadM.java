import java.util.Scanner;

/**
 * 
 * @author Adrián
 * @descripcion Saber si es mayor de edad
 * @ejercicio  1.8
 *
 */
public class EdadM {
	public  static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Escriba su edad: ");
		int edad = sc.nextInt();
		boolean mayorEdad = edad >= 18;
		System.out.println("Mayoría de edad: " + mayorEdad);
	}
}
