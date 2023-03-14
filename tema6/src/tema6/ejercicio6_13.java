package tema6;
import java.util.Scanner;
public class ejercicio6_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Indique la sentencia en C ->\t");
		String sentencia=sc.nextLine();
		int inicio, fin;
		inicio=sentencia.indexOf("/*");
		System.out.println(inicio);
		while (inicio!=-1) {
			fin=sentencia.indexOf("*/", inicio);
			sentencia=sentencia.substring(0,inicio)+sentencia.substring(fin+2);
			inicio=sentencia.indexOf("/*");
		}
		System.out.println(sentencia);
		sc.close();
		
		
		
		
	}

}
