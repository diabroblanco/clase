package tema6;

public class EjemploContiene {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena="La ingratitud es hija de la soberbia";
		System.out.println("Buscar la palabra hijo en la cadena->" + cadena.contains("hijo"));
		String palabra="Ingratitud";
		System.out.println("Buscar la palabra " +palabra+ "en la cadena->" +cadena.toLowerCase().contains(palabra.toLowerCase()));
		System.out.println("Buscar la palabra " +palabra+ "en la cadena->" +cadena.contains(palabra));

		
		
	}

}
