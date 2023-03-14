package tema6;
import java.util.Scanner;
public class Resuelta6_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		final String PREFIJOS="Javalín, javalón";
		final String SUFIJO="javalén, len, len";
		System.out.println("Escribe una frase: ");
		String frase=sc.nextLine();
		boolean idiomaJavalandia=false;
		if(frase.startsWith(PREFIJOS)) {
			
			idiomaJavalandia=true;
			frase=frase.substring(PREFIJOS.length());
			
		} if (frase.endsWith(SUFIJO)) {
			idiomaJavalandia=true;
			frase=frase.substring(0, frase.length()- SUFIJO.length());
		}
		if(idiomaJavalandia) {
			frase=frase.strip();
			System.out.println(frase);
		}else {
			System.out.println("No está escrito en el idioma JAVALANDIA");
			System.out.println("Así sería en el idioma JAVALANDIA " +PREFIJOS +" " + frase + " o \n"+  frase+ " " + SUFIJO);
		}
		
		
		
		
	}

}
