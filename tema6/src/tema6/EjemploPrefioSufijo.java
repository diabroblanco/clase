package tema6;

import java.util.Scanner;

public class EjemploPrefioSufijo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String cadena="En un lugar de la Mancha", preString="en", sufString="ha";
		System.out.println("Buscamos el prefijo " +preString+ " en la cadena "+ cadena+" es ->" + cadena.startsWith(preString));
		System.out.println("Buscamos el sufijo " +sufString+ " en la cadena "+ cadena + "es -> " + cadena.endsWith(sufString));
		System.out.print("Indica tu telefono ->");
		int telefono=sc.nextInt();
		String telefonoString=String.valueOf(telefono);
		if(!telefonoString.startsWith("6") && !telefonoString.startsWith("7") && !telefonoString.startsWith("9") && telefonoString.length()==9 && !telefonoString.isEmpty()) {
				System.out.println("Teléfono no válido");
		}
		sc.close();
	}

}
