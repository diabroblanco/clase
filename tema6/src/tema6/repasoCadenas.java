package tema6;

import java.util.Scanner;

public class repasoCadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//valueof
		//declaramos las cadenas para el ejemplo
		int edad=15;
		String cadena1=String.valueOf(edad);
		System.out.println("Tu edad es "+cadena1);
		
		
		
		//equals
		String edadMayor="18";
		if(cadena1.equals(edadMayor)) {
			System.out.println("Eres mayor de edad");
		}else {
			System.out.println("Eres menor de edad");
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Tienes ganas de comer gachas? -> Si o No -> ");
		String pregunta=sc.next();
		if(pregunta.equalsIgnoreCase("Si")) {
			System.out.println("Ve al plinio");
		}else if (pregunta.equalsIgnoreCase("No")){
			System.out.println("Vete a dormir");
		}
		
		//regionMatch
		System.out.println("******RegionMatch******");
		String cadena3="Mi gato me roba la silla";
		String cadena4="La comida de gato es cara";
		System.out.println(cadena3.regionMatches(3, cadena4, 13, 4));
		cadena4=cadena4.toUpperCase();
		System.out.println(cadena3.regionMatches(3, cadena4, 13, 4));
		System.out.println(cadena3.regionMatches(true,3, cadena4, 13, 4));

		
		sc.close();
	}

}
