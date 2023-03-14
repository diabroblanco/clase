package tema6;
import java.util.Scanner;
public class resuelta6_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String nombre, vocales= "";
		char c;
		System.out.println("Escriba su nombre completo: ");
		nombre=sc.nextLine();
		for(int i=0;i<nombre.length();i++) {
			c=nombre.charAt(i);
			if(!Esvocal(c)) {
				vocales=vocales + c;
			}
		}
		System.out.println(vocales);
	}

	private static boolean Esvocal(char c) {
			boolean resultado;
			String lasvocales="aeiouáéíóú";
			c=Character.toLowerCase(c);
			if(lasvocales.indexOf(c)==-1) {
				resultado=false;
			}else {
				resultado=true;
			}
		return resultado;
	}

}
