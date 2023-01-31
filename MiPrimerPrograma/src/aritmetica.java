import java.util.Scanner;
/**
 * 
 * @author Adrián
 * @descripcion Calcular media aritmetica de dos notas enteras.
 * @ejercicio 1.6
 *
 */
public class aritmetica {
	public static void main(String[] args) {
	int nota1, nota2;
	double media;
	Scanner sc = new Scanner(System.in);
	System.out.print("Nota1: ");
	nota1 = sc.nextInt();
	System.out.print("Nota2: ");
	nota2 = sc.nextInt();
	media = (nota1 + nota2) / 2.0;
	System.out.println("La media es: " + media);
	}
}
