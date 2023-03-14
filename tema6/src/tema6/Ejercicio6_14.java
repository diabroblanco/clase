package tema6;
import java.util.Arrays;
import java.util.Scanner;

import javax.lang.model.element.Element;

public class Ejercicio6_14 {
	static String[] agenda=new String[0];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		menuPrincipal();
		
		
		
	}
		static void menuPrincipal() {
			int opcion;
			do {
				System.out.println("\t@ Agenda Telefónica @");
				System.out.println("\t\t1\u27A1 Alta");
				System.out.println("\t\t2\u27A1 Buscar");
				System.out.println("\t\t3\u27A1 Modificar");
				System.out.println("\t\t4\u27A1 Mostrar");
				System.out.println("\t\t5\u27A1 Salir");
				System.out.println("\n\tSu opcion es \u27A1");
				opcion=new Scanner(System.in).nextInt();
				switch (opcion) {
				case 1->{alta();}
				case 2->{buscarModificar(2);}
				case 3->{buscarModificar(3);}
				case 4->{mostrar();}
			
				}
			
			}while(opcion!=5);
		}
		static void alta() {
			agenda=Arrays.copyOf(agenda, agenda.length+1);
			String nombre;
			do {
				System.out.print("\n\tIndique el nombre \u27A1");
				nombre=new Scanner(System.in).nextLine();

			}
			while(nombre.isEmpty());
			nombre =pasarMayu(nombre);
			//nombre =nombre.substring(0,1).toUpperCase( )+nombre.substring(1).toLowerCase();
			String telefono;
			do {
			System.out.print("\n\tIndique el telefono \u27A1");
			telefono=new Scanner(System.in).nextLine();
			}while(validarTelefono(telefono));
			agenda[agenda.length-1]=nombre+":"+telefono;
		}
		static String pasarMayu(String cadena) {
			String[] arrayCadena=cadena.split(" ");
			String temp="";
			for(int i=0;i<arrayCadena.length;i++) {
				arrayCadena[i]=arrayCadena[i].substring(0,1).toUpperCase()+arrayCadena[i].substring(1).toLowerCase();
				temp+=arrayCadena[i]+" ";
			}
			return temp;
		}
		static boolean validarTelefono(String telefono) {
			boolean correcto=false;
			if((!telefono.startsWith("9")&& !telefono.startsWith("6") && !telefono.startsWith("7")) || telefono.length()!=9) {
				correcto=true;
			}
			return correcto;
		}
		static void buscarModificar(int opcion) {
			String nombre;
			boolean encontrado=false;
			do {
				System.out.print("\n\tIndique el nombre a buscar\u27A1");
				nombre=new Scanner(System.in).nextLine();
			}while (nombre.isEmpty());
			nombre=pasarMayu(nombre);

				for(int i=0;i<agenda.length;i++) {
					String aux[]=agenda[i].split(":");
					if(aux[0].startsWith(nombre)&& opcion==2) {
						System.out.println("\t"+aux[0]+ "\u27A1\t("+aux[1]+")");
						encontrado=true;
					}
					if(aux[0].startsWith(nombre)&& opcion==3) {
						String telefono;
						do {
							System.out.println("\n\tIndique telefono de "+aux[0]+"->");
							telefono=new Scanner(System.in).nextLine();
						}while(validarTelefono(telefono));
						agenda[i]=aux[0]+":"+telefono;
						System.out.println("\tModificado correctamente...");
						encontrado=true;
					}
				}
				if(!encontrado)System.out.println("\tEl contacto no existe en la Agenda");
			
		}
		static void mostrar() {
			for(String dato:agenda) {
				String[] aux=dato.split(":");
				System.out.println("\t"+aux[0]+ "\u27A1\t("+aux[1]+")");
			}
		}
		
}
