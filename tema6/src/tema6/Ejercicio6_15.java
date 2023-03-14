package tema6;
import java.util.Scanner;
public class Ejercicio6_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Titulo");
		String titulo=sc.nextLine();
		System.out.println("Contenido");
		String contenido=sc.nextLine();
		System.out.println("<!DOCTYPE html>");
		System.out.println("<html>");
		System.out.println("<head>");
		System.out.println("<title>\"Creando con Java\"</title>");
		System.out.println("</head>");
		
		System.out.println("<body>");
		System.out.println("<h1>"+ titulo +"</h1>");
		System.out.println("\t<p>" +contenido+"</p>");
		System.out.println("</body>");
		System.out.println("</html>");
		
	}

}
