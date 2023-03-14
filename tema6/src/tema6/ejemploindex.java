package tema6;

public class ejemploindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena="Hola Mundo Java";
		System.out.println("Index sin indicadores ú-> " + cadena.indexOf('a'));
		System.out.println("Index sin indicadores a-> " + cadena.indexOf('ú'));
		System.out.println("Index a partir de la posicion 4 y busque a-> " + cadena.indexOf('a',4));
		System.out.println("IndexOf buscando una cadena dada \"Mundo\" -> " + cadena.indexOf("Mundo"));
		System.out.println("IndexOf buscando una cadena dada \"Mundo\" e indice 6 -> " + cadena.indexOf("Mundo",6));
		//lastindexOf
		System.out.println("Lastindexof sin indicadores a -> "+ cadena.lastIndexOf('a'));
		System.out.println("Lastindexof con indicadores o -> "+ cadena.lastIndexOf('o', 8));

	}

}
