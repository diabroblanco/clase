import java.util.Scanner;
/**
 * 
 * @author Adrián
 * @descripcion Calcular cuantos años tendrás el año que viene
 * @ejercicio 1.3
 */
public class Edad {
	public static void main(String[] args) {
		int edad; //aquí guardaremos la edad del usuario
		Scanner sc = new Scanner(System.in);
		System.out.print("Escriba su edad:  ");
		edad = sc.nextInt();
		edad = edad + 1; //el año que viene tendrá un año más
		System.out.println("El próximo año su edad será: "+ edad + " años");
	}
}
