import java.util.Locale;
import java.util.Scanner;
/**
 * 
 * @author Adrián
 * @Descripcion Redondeo al numero mas cercano
 * @Ejercicio 1.14
 *
 */
public class Redondeo {
	public static void main(String[] args) {
		double n;
		int redondeo;
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		System.out.print("Escriba el numero decial (con punto): ");
		n = sc.nextDouble();
		redondeo = (int)(n + 0.5); 
		System.out.println(n + "redondeado es: " + redondeo);
	}
}
