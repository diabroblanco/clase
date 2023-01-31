import java.util.*;
/**
 * 
 * @author Adrián
 * @descripcion Calcula beneficios anuales
 * @ejercicio 1.11
 * 
 *
 */
public class beneficios {
	public static void main(String[] args) {
		final double PRECIO_MANZANAS = 2.35;
		final double PRECIO_PERAS = 1.95;
		int vManz1Sem, vPeras1Sem;
		int vManz2Sem, VpERAS2Sem;
		double impTotal;
		Scanner sc = new Scanner(System.in);
		System.out.print("Para las manzanas");
		System.out.print(" Ventas (en kilos) del primer semestre");
		vManz1Sem = sc.nextInt();
		System.out.print("Ventas (en kilos)del segundo semestre");
		vManz2Sem = sc.nextInt();
		System.out.print("Para las peras");
		System.out.print(" Ventas (en kilos) del primer semestre");
		vPeras1Sem = sc.nextInt();
		System.out.print(" Ventas (en kilos) del segundo semestre");
		VpERAS2Sem = sc.nextInt();
		impTotal = (vManz1Sem + vManz2Sem) * PRECIO_MANZANAS;
		impTotal += (vPeras1Sem + VpERAS2Sem) * PRECIO_PERAS;
		System.out.println("El importe total es de: " + impTotal + "euros");
		
	}
}
