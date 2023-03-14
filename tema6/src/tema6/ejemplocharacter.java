package tema6;

public class ejemplocharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//char a='8';
		//char b='c';
		//char c=' ';
	//	System.out.println(Character.isDigit(b));
	//	System.out.println(Character.isLetterOrDigit(a));
	//	System.out.println(Character.isUpperCase(a));
	//	System.out.println(Character.isWhitespace(c));
		char letra='A',letra2;
		letra2=Character.toLowerCase(letra);
		System.out.println(letra2);
		char letra3='b',letra4;
		letra4=Character.toUpperCase(letra3);
		System.out.println(letra4);
		String cadena1="hola mundo";
		String cadena2="HOLA MUNDO";
		System.out.println(cadena1.equals(cadena2));
		System.out.println(cambio(cadena1));
		char letras=cadena1.charAt(5);
		System.out.println(letras);
	
	}
	static String cambio(String palabra) {
		String conversion="Adios";
		return conversion;
	}

}
