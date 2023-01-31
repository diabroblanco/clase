import java.util.Scanner;
/**
 * 
 * @author Adrián
 * @descripcion Programa que pide número
 * @ejercicio 1.2
 *
 */
public class Numero {
	public static void main(String[] args) {
		int num;
		System.out.print("Escriba un Número: ");
		Scanner sc= new Scanner(System.in);
		num = sc.nextInt(12);
		System.out.println("Valor introducido: "+ num);
	}

}
