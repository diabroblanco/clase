package tercerproyecto;
import java.util.Scanner;
public class ejercicio34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int etiquetaarbolalto;
		int alturaarbolalto;
		int etiqueta = 0;
		int altura;
		System.out.print("Altura del árbol(" + etiqueta + "): ");
		altura=sc.nextInt();
		alturaarbolalto = altura;
		etiquetaarbolalto = 0;
		while (altura != -1) {
			if (altura > alturaarbolalto) {
				alturaarbolalto = altura;
				etiquetaarbolalto = etiqueta;
			}
			etiqueta++;
			System.out.print("Altura del árbol (" + etiqueta +"): ");
			altura=sc.nextInt();
		}
		if (alturaarbolalto == -1) {
			System.out.println("No hay arboles, planta alguno");
		} else {
			System.out.println("El árbol mas alto mide: " + alturaarbolalto);
			System.out.println("La etiqueta del arbol es: " + etiquetaarbolalto);
		}

	}

}
