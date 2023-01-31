package SegundoProyecto;

import java.util.Locale;
import java.util.Scanner;

public class precioentrada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Aforo del local: ");
		int aforo=sc.nextInt();
		System.out.print("Precio entrada: ");
		double precioentrada = sc.nextDouble();
		System.out.println("Entradas vendidas: ");
		int Entradasvendidas= sc.nextInt();
		double reacudación = precioentrada * Entradasvendidas;
		if(Entradasvendidas < aforo*0.2) {
			System.out.println("Se cancela el concierto");
			reacudación=0;
		}else if (Entradasvendidas < aforo*0.5) {
			System.out.println("Entradas rebajadas un 25% ");
			reacudación *=(075);
		} else {
			System.out.println("Concierto normal");
		}
		System.out.println("Recaudación:" + reacudación);
	}

}
