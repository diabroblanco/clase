package tema6;
import java.util.Arrays;
import java.util.Scanner;
public class ahorcado {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String palabraSecreta, auxiliar;
		int intentos=7;
		char letra;
		System.out.println("Jugador 1. Escribe la palabra a adivinar ");
		palabraSecreta=sc.next().toLowerCase();
		String respuesta=palabraSecreta;
		char[]guiones=new char[palabraSecreta.length()];
		Arrays.fill(guiones, '-');
		for(int i=0;i<30;i++)System.out.println();
		while(!palabraSecreta.equals(String.valueOf(guiones)) && intentos>0) {
			boolean acierto=false;
			System.out.println(String.valueOf(guiones)+ "\tIntento: "+ intentos);
			System.out.print("Jugador 2 escribe la letra: ");
			auxiliar=sc.nextLine().toLowerCase();
			
			String guion=String.valueOf(guiones);
			
			if(!auxiliar.isEmpty() ) {
				for(int i=0;i<palabraSecreta.length();i++) {
					letra=auxiliar.charAt(0);
					if(palabraSecreta.charAt(i)==letra && guion.indexOf(letra)==-1) {
						guiones[i]=letra;
						acierto=true;
					}
				}
				if(!acierto)intentos--;
			}
		}
		if(intentos>0) {
			System.out.println("La palabra es -> " + respuesta);
			System.out.println("Jugador 2 has ganado. ENHORABUENA");
		}else {
			System.out.println("La palabra era -> " + respuesta);

			System.out.println("Jugador 2 te has morido");
		}
	}

}
