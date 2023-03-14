package tema6;
import java.util.Scanner;
public class resuelta6_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String frase;
		int espacios=0;
		char c;
		System.out.println("Escribe una frase ");
		frase=sc.nextLine();
		for (int i=0;i<frase.length();i++) {
			c=frase.charAt(i);
			if(Character.isSpaceChar(c)) {
				espacios++;
			}
		}
		System.out.println("Tiene: " +espacios + " espacios en blanco");
	}

}
