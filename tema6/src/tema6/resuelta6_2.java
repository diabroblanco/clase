package tema6;
import java.util.Scanner;


public class resuelta6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("PRIMERA FRASE: ");
		String frase1=sc.nextLine();
		System.out.println("SEGUNDA FRASE: ");
		String frase2=sc.nextLine();

		if(frase1.length()==frase2.length()) {
			System.out.println(" Son iguales en longitud ");
			
		}else if(frase1.length()>frase2.length()){
			System.out.println(frase1 + " Es mas larga " + frase2);
		}else {
			System.out.println(frase2 + " Es mas larga " + frase1);
		}
	}

}
