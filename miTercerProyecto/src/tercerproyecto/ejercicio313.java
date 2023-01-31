package tercerproyecto;
import java.util.Scanner;
public class ejercicio313 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int aprobados=0, suspensos=0, septiembre=0;
		for (int i=1; i <=6; i++) {
			System.out.print("Nota del alumno " + i + " : ");
			int nota=sc.nextInt();
			if (nota==4) {
				septiembre++;
			} else if (nota >=5) {
				aprobados++;
			} else if (nota <4) {
				suspensos++;
			}
		}
		System.out.println("Han aprobado: " + aprobados);
		System.err.println("SUSPENDIDOS PERO POR MUCHO: " + suspensos);
		System.out.println("Qué poco ha faltado para librarte de septiembre: " +septiembre);
	}

}
