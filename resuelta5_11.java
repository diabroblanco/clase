package Ejercicios;
import java.util.Scanner;
import java.util.Arrays;
public class resuelta5_11 {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Cuantos numeros tiene la combinacion  secreta");
		int longitud=sc.nextInt();
		int combSecreta[]=new int [longitud];
		int combJugador[]=new int [longitud];
		generaCombinacion(combSecreta);
		System.out.println(Arrays.toString(combSecreta));
				
		while(!Arrays.equals(combSecreta, combJugador)) {
			//muestraPista(combSecreta, combJugador);
			System.out.println("Escribe una combinación ");
			leeTabla(combJugador);
			
		}
		System.out.println("La camara se ha abierto");
		
	}
	static void generaCombinacion(int t[]) {
		final int max=5;
		for(int i=0;i<t.length;i++) {
			t[i]= (int)(Math.random()*max+1);
		}
		
	}
	static void leeTabla(int t[]) {
		for(int i=0;i<t.length;i++) {
			t[i]=sc.nextInt();
		}
	}
	static void muestraPista(int secret[], int jug[]) {
		System.out.print("Pistas: ");
		for (int i=0;i<jug.length;i++) {
			System.out.print(jug[i]);
		if (secret[i]>jug[i]) {
		System.out.println("Mayor");
		}else if(secret[i]<jug[i]) {
			System.out.println("Menor");
	}	else {
		System.out.println("igual");
	}
	}
	}
}
