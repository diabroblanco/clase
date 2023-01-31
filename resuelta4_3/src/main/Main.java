package main;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Introduzca radio: ");
		double radio=sc.nextDouble();
		System.out.print("Introduzca altura: ");
		double altura=sc.nextDouble();
		System.out.print("Que desea calcular (1 volumen/2 area)");
		int calculo=sc.nextInt();
		System.out.println();
		areaCilindro(radio, altura, calculo);

	}
static void areaCilindro(double radio, double altura, int opcion) {
	double volumen, area;
	switch(opcion) {
	case 1->{
		volumen=Math.PI*Math.pow(radio, 2)* altura;
		System.out.println("El volumen es: " + volumen);
	}
	case 2->{
		area= 2* Math.PI * radio* (altura +radio);
		System.out.println("El área es de: " + area);
	}
	default->
	System.out.println("Indicador erroneo");
	}
}
}
