package tema6;

import java.util.Scanner;

public class comprobaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Verificar si la cadena está vacia
		String cadena1="";
		String cadena2="\t";
		String cadena3="Hola chicos";
		System.out.println("Resultado de cadena1 -> "+cadena1.isEmpty());
		System.out.println("Resultado de cadena2 -> "+cadena2.isEmpty());
		System.out.println("Resultado de cadena2 -> "+cadena2.isBlank());
		System.out.println("Resultado de cadena3 -> "+cadena3.isEmpty());
        Scanner sc = new Scanner(System.in);		
        String nombre="";
        do {
        System.out.print("Indica tu nombre -> ");
         nombre=sc.nextLine();
        }while(nombre.isEmpty());
        System.out.println("Tu nombre es: " +nombre);
	}

}
