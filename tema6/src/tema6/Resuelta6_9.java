package tema6;
import java.util.Scanner;
public class Resuelta6_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String frase="", palabra;
		System.out.println("Escriba una palabra ");
		palabra=sc.next();
		while (!palabra.toLowerCase().equals("fin")) {
			frase=frase + " " + palabra;
			System.out.println("Escribe una palabra ");
			palabra=sc.next();
		}
		System.out.println(frase);
	}

}
