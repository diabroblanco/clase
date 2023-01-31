import java.util.*;
/**
 * 
 * @author Adrián
 * @Descripcion Pedir número y mostrar valor absoluto
 * @ejercicio 1.12
 *
 *
 */
public class valorAb {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba un número (positivo o negativo)");
		int n =sc.nextInt();
		int valorAbsoluto = n < 0 ? -1 * n : n;
		System.out.println("El valor Absoluto de " + n + " es " + valorAbsoluto);
	}

}
