package SegundoProyecto;
import java.util.Scanner;
import java.util.zip.ZipEntry;
public class letranumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Escribe un numero del 1 al 99: ");
		int numero=sc.nextInt();
		switch (numero) {
		case 10:
			System.out.println(" diez");
			break;
		case 11 :
			System.out.println("ONCE");
			break;
		case 12 :
			System.out.println("Doce");	
			
		case 13 :
			System.out.println("Trece");
			break;
		case 14 :
		System.out.println("Catorce");
		break;
		case 15 :
		System.out.println("Quince");
		break;
		case 16 :
		System.out.println("Dieciseis");
		break;
		case 17 :
		System.out.println("diecisiete");
		break;
		case 18 :
		System.out.println("dieciocho");
		break;
		case 19 :
		System.out.println("diecinueve");
		break;
		case 20 :
		System.out.println("veinte");
		break;
		case 21 :
		System.out.println("veintiuno");
		break;
		case 22 :
		System.out.println("veintidos");
		break;
		case 23 :
		System.out.println("veintitres");
		break;
		case 24 :
		System.out.println("veinticuatro");
		break;
		case 25 :
		System.out.println("veinticinco");
		break;
		case 26 :
		System.out.println("veintiseis");
		break;
		case 27 :
		System.out.println("veintisiete");
		break;
		case 28 :
		System.out.println("veintiocho");
		break;
		case 29:
		System.out.println("veintinueve");
		break;
		default:{
			int u = numero%10;
			System.out.println(u);
			int d = numero/10;
			System.out.print(d);
			
		switch (d) {
		case 3:
			System.out.println(" Treinta");
			break;
		case 4:
			System.out.println(" Cuarenta");
			break;
		case 5:
			System.out.println(" Cincuenta");
			break;
		case 6:
			System.out.println(" Sesenta");
			break;
		case 7:
			System.out.println(" Setenta");
			break;
		case 8:
			System.out.println(" Ochenta");
			break;
		case 9:
			System.out.println(" Noventa");
			break;

				
			} if ( d>= 3 && u != 0) {
				System.out.println(" y ");
			
			}
			switch (u) {
			case 1->
			System.out.println(" Uno");
			case 2 ->
			System.out.println(" Dos");
			case 3 ->
			System.out.println(" Tres");
			case 4 ->
			System.out.println(" Cuatro");
			case 5 ->
			System.out.println(" Cinco");
			case 6 ->
			System.out.println(" Seis");
			case 7 ->
			System.out.println(" Siete");
			case 8 ->
			System.out.println(" Ocho");
			case 9 -> 
			System.out.println(" NUeve");
			}
			
			
			
		}
			
		}
		
		
			
	}			
	}

		



