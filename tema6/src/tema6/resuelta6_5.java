package tema6;
import java.util.Scanner;
public class resuelta6_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String normal, invertido;
		System.out.println("Escribe una frase");
		normal=sc.nextLine();
		invertido= reves(normal);
		System.out.println(invertido);
		
	}
	static String reves(String Original) {
		String espacio="";
		for(int i=0; i<Original.length();i++) {
			espacio=Original.charAt(i) + espacio;
		}
		return espacio;
	}
	
	
	
}
