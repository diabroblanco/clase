import java.util.Scanner;

/**
 * 
 * @author Adrián
 * @descripcion Algoritmo que dice si podemos o no salir a la calle
 * @ejercicio 1.10
 *
 */
public class algoritmo {
	public static void main(String[] args) {
		
		boolean llueve, finalizadoTareas, irBiblioteca;
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Está lloviendo? (true/false)");
		llueve = sc.nextBoolean();
		System.out.println("¿Has finalizado tus tareas? (true/false)");
		finalizadoTareas = sc.nextBoolean();
		System.out.println("¿Tienes que ir a la biblioteca? (true/false)");
		irBiblioteca = sc.nextBoolean();
		boolean salir = !llueve && finalizadoTareas || irBiblioteca;
		System.out.println("Puedes salir: " + salir);
		
	}
}
