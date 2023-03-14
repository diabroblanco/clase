package tema6;
import java.util.Scanner;
public class resuelta6_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String contrasena, intento;
		System.out.println("Jugador 1 escribe la contraseña");
		contrasena=sc.nextLine();
		System.out.println("La contraseña tiene " + contrasena.length() + " Caracteres");
		System.out.println("Jugador 2 intente adivinar la contraseña ");
		intento=sc.nextLine();
		while (!intento.equals(contrasena)) {
			String pista="";
			for(int i=0; i< contrasena.length();i++) {
				if(intento.charAt(i)==contrasena.charAt(i)) {
					pista +=contrasena.charAt(i);
				}else {
					pista+='*';
					intento=intento + '*';

				}
			}
			System.out.println(pista);
			System.out.println("Ha fallado prueba otra vez");
			intento=sc.nextLine();
		}
		System.out.println("Has acertado");
	}

}
