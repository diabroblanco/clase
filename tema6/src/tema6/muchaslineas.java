package tema6;


public class muchaslineas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena1="hola mundo";
		String cadena2="HOLA MUNDO";
		System.out.println("Metodo equals     ->\t"+cadena1.equals(cadena2));
		System.out.println("Metodo equals     ->\t"+cadena1.equalsIgnoreCase(cadena2));
		char letra=cadena1.charAt(5);
		System.out.println("Metodo charat     ->\t"+letra);
		String cadena3="!QUE BIEN ES VIERNES";
		System.out.println("Metodo CONCAT     ->\t"+cadena2.concat(cadena3));
		System.out.println("Metodo startwith     ->\t"+cadena2.startsWith("Hol"));
		System.out.println("Metodo endwith     ->\t"+cadena2.endsWith("NDO"));
		String cadena4=" Es una prueba";
		System.out.println("Metodo strip     ->\t"+cadena4.strip());
		System.out.println("Metodo stripleading     ->\t"+cadena4.stripLeading());
		System.out.println("Metodo stritrailing     ->\t"+cadena4.stripTrailing());
		System.out.println("Metodo length    ->\t"+cadena2.length());
		System.out.println("Metodo substring     ->\t"+cadena2.substring(0));
		System.out.println("Metodo substring     ->\t"+cadena2.substring(5,cadena2.length()));
		System.out.println("Metodo isEmpty     ->\t"+cadena2.isEmpty());
		String cadena6=" ";
		System.out.println("Metodo isBlank     ->\t"+cadena6.isBlank());












	}

	

}
