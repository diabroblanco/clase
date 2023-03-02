package resuelta7_9;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Bombilla salonBombilla=new Bombilla();
		Bombilla hab1=new Bombilla();
		Bombilla hab2=new Bombilla();
		Bombilla cocina=new Bombilla();
		Bombilla banio=new Bombilla();
		Bombilla terraza=new Bombilla();
		int opcion;
		do {
			System.out.println("Qué bombilla quieres modificar");
			System.out.println("1. Salón "+ salonBombilla.mostrarEstado());
			System.out.println("2. Cocina "+ cocina.mostrarEstado());
			System.out.println("3. Baño  "+ banio.mostrarEstado());
			System.out.println("4. Habitación Principal "+ hab1.mostrarEstado());
			System.out.println("5. Habitacion auxiliar "+ hab2.mostrarEstado());
			System.out.println("6.Terraza"+ terraza.mostrarEstado());
			System.out.println("7. Interruptor general "+ Bombilla.interruptorGeneral);
			System.out.println("8. Salir ");
			opcion=sc.nextInt();
			switch (opcion) {
			case 1->
				salonBombilla.encenderOapagar();
			
			case 2->{
				cocina.encenderOapagar();
			}
			
			case 3->banio.encenderOapagar();
			
			case 4->hab1.encenderOapagar();
			
			case 5->hab2.encenderOapagar();
			
			case 6->terraza.encenderOapagar();
			case 7->{
				if(Bombilla.interruptorGeneral) {
					Bombilla.interruptorGeneral=false;
				}else {
					Bombilla.interruptorGeneral=true;
				}
				
			}
			
			default->System.out.println("Error");
			}
			
			
		}while(opcion!=8);
		
		
		
	}

}
