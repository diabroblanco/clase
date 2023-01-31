import java.util.*;

/**
 * 
 * @author Adrián
 * @descripcion Programa que pida un numero al usuario e indique si es par
 * @ejercicio 1.9
 *
 */
public class Nusuario {
	public static void main(String[] args) {

		int numero;
		System.out.print("Escriba un numero: ");
		numero = new Scanner(System.in) .nextInt();
		boolean esPar = (numero % 2) == 0;
		System.out.println("Es par: " + esPar);
		
	}

}
