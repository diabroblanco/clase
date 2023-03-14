package ejercicio7_6;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Horas h=new Horas();
		System.out.print("Hora: ");
		h.setHora(sc.nextInt());
		System.out.print("Minutos: ");
		h.setMinutos(sc.nextInt());
		System.out.print("Segundos: ");
		h.setSegundos(sc.nextInt());

		System.out.println("Cuantos segundos quieres mostrar");
		int numSegundos=sc.nextInt();
		
		for(int i=0;i<=numSegundos;i++) {
			System.out.println(h.getHora()+":"+h.getMinutos()+":"+h.getSegundos());
			//System.out.printf("%02d:%02d:%02d\n",h.getHora()+":"+h.getMinutos()+":"+h.getSegundos());
			h.incrementarSegundos();
		}
	}

}
