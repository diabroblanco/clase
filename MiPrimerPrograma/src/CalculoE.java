import java.util.Scanner;
/**
 * 
 * @author Adrián
 *@descripcion calcular edad a partir del año nacimiento y el actual
 *@ejercicio 1.4
 */
public class CalculoE {
	public static void main(String[] args) {
		int aActual; //año en curso (actual)
		int aNacimiento; //Año de nacimiento
		int edad;
		Scanner sc = new Scanner(System.in);
		//leemos los datos
		System.out.print("Año nacimiento: ");
		aNacimiento = sc.nextInt();
		System.out.print("Año actual: ");
		aActual = sc.nextInt();
		edad = aActual - aNacimiento; //calculamos la edad
		System.out.println("Su edad es: " + edad+ " años.");
	}

}
