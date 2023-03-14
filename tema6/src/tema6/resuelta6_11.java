package tema6;
import java.util.Scanner;
public class resuelta6_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		final char CONJUNTO1[]= {'e','i','o','m','b','q','r','s','t','u','l'};
		final char CONJUNTO2[]= {'1','$','4','!','€','9','e','-','5','@','3'};
		
		System.out.println("Escribe un texto que te lo codifico");
		String texoString=sc.nextLine().toLowerCase();
		char[] codificado=new char[texoString.length()];
		for(int i=0;i<texoString.length();i++) {
			codificado[i]=Layton(CONJUNTO1, CONJUNTO2, texoString.charAt(i));
		}
		texoString=String.valueOf(codificado);
		System.out.println(texoString.replaceAll(" ",""));
		
		for(int i=0;i<texoString.length();i++) {
			codificado[i]=Luke(CONJUNTO1, CONJUNTO2, texoString.charAt(i));
		}
		texoString=String.valueOf(codificado);
		System.out.println(texoString);
	}
	static char Layton(char CONJUNTO1[], char CONJUNTO2[], char c ) {
		final String CONJU1=String.valueOf(CONJUNTO1);
		char codificado;
		
		int pos=CONJU1.indexOf(c);
		if (pos==-1) {
			codificado=c;
		}else {
			codificado=CONJUNTO2[pos];
		}
		return codificado;
		
		
	}
	static char Luke(char CONJUNTO1[], char CONJUNTO2[], char c) {
		final String CONJU2=String.valueOf(CONJUNTO2);
		char codificado;
		int pos=CONJU2.indexOf(c);
		if(pos==-1) {
			codificado=c;
		}else {
			codificado=CONJUNTO1[pos];
		}
		return codificado;
	}
}
