package SegundoProyecto;
import java.util.Scanner;
public class DNi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Introduce solo los numeros de tu dni: ");
		int dni=sc.nextInt();
		String letra;
		letra = switch (dni%23) {
		case 0-> "T";
		case 1-> "R";
		case 2->  "W";
		case 3->  "A";
		case 4->  "G";
		case 5->  "M";
		case 6->  "Y";
		case 7->  "F";
		case 8->  "P";
		case 9->  "D";
		case 10-> "X";
		case 11->  "B";
		case 12->  "N";
		case 13->  "J";
		case 14->  "Z";
		case 15->  "S";
		case 16->  "Q";
		case 17->  "V";
		case 18->  "H";
		case 19->  "L";
		case 20->  "C";
		case 21->  "K";
		case 22->  "E";
		default -> "Error";
		
		};
	
		
		System.out.println(dni+letra);

	}

}
