package tercerproyecto;
 import java.util.Scanner;
 
public class ejercicio35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int resultado, numero1, numero2;
		int cantoperaciones = 0;
		
		do {
			
			numero1= (int)(Math.random()*100 + 1);
			numero2= (int)(Math.random()*100 + 1);
			System.out.print(numero1 + "+" + numero2 + " = ");
			resultado=new Scanner(System.in).nextInt();
			cantoperaciones++;
			
		}while (resultado== numero1 +numero2);
		System.out.println("Has acertado un total de  " + (cantoperaciones - 1) + " sumas consecutivas");
	}

}
