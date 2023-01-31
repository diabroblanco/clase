package main;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("La i es una vocal " + esVocal('i'));
		System.out.println("La E es una vocal " + esVocal('E'));
		System.out.println("La f es una vocal "+ esVocal('f'));
		System.out.println("Escribe una letra ");
		char c=sc.next().charAt(0);
		System.out.println(c +" es " +esVocal(c));

	}
static boolean esVocal(char c) {
	boolean resultado;
	if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||
		c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
		resultado=true;
	}else {
		resultado=false;
	}
	return resultado;
}
}
