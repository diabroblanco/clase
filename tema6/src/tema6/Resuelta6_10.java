package tema6;
import java.util.Scanner;
public class Resuelta6_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String frase, sinEspacios, invertida;
		System.out.println("Escribe una frase ");
		frase=sc.nextLine();
		frase= frase.toLowerCase();
		sinEspacios=noEspacios(frase);
		invertida=reves(sinEspacios);
		if(sinEspacios.equals(invertida)) {
			System.out.println("Es palíndroma");
		}else {
			System.out.println("No es palíndroma");
		}
		
	}
	static String noEspacios(String cadena) {
		String no=""; 
		for(int i=0;i<cadena.length();i++) {
			char c=cadena.charAt(i);
			if(!Character.isWhitespace(c)) {
				no=no+c;
			}
		}
		return no;
	}
	static String reves(String Original) {
		String espacio="";
		for(int i=0; i<Original.length();i++) {
			espacio=Original.charAt(i) + espacio;
		}
		return espacio;
	}
}
