package ejercicio7_8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		SintonizadorFM ponerFm=new SintonizadorFM();

		int opcion;
		do {
			System.out.println(" *** RADIO FM ***");
			System.out.println("1. Subir  ");
			System.out.println("2. Bajar  ");
			System.out.println("3. Favoritos ");
			System.out.println("4. Apagar ");
			opcion=scanner.nextInt();
			switch(opcion) {
			case 1->{ponerFm.up();
				ponerFm.display();
			}
			case 2->{ponerFm.down();
			ponerFm.display();
			}
			case 3->{
				System.out.print("Indica la frecuencia Favorita: ");
				ponerFm.setFrecuencia(scanner.nextDouble());
				ponerFm.display();
			}
			case 4->System.out.println("Radio Apagada");
			
			
			
			default->System.out.println("Opcion no valida");
			}
			
			
		}while(opcion!=4);
		
		
		
	}

}
