package resuelta7_11;
import java.util.Arrays;
public class Lista {
	Integer[] tabla;
	
	
	public Lista() {
		tabla=new Integer[0];
	}
	void Principio(Integer copia) {
		tabla=Arrays.copyOf(tabla, tabla.length+1);
		System.arraycopy(tabla, 0, tabla, 1, tabla.length-1);
		tabla[0]=copia;	
	}
	void Final(Integer copia) {
		tabla=Arrays.copyOf(tabla,tabla.length+1);
		tabla[tabla.length-1]=copia;
	}
	void Final(Lista lista2) {
		int tamTabla=tabla.length;
		tabla=Arrays.copyOf(tabla, tabla.length + lista2.tabla.length);
		System.arraycopy(lista2.tabla,0, tabla, tamTabla, lista2.tabla.length);
	}
	void insertar(int posicion, Integer nuevo) {
		tabla=Arrays.copyOf(tabla, tabla.length+1);
		System.arraycopy(tabla, posicion, tabla, posicion+1,tabla.length-posicion-1);
		tabla[posicion]=nuevo;
	}
	Integer eliminar(int indicar) {
		Integer borrado=null;
		if(indicar>=0 &&indicar<tabla.length) {
			borrado=tabla[indicar];
			for(int i=indicar;i<tabla.length;i++){
				tabla[i-1]= tabla[i];
			}
			tabla=Arrays.copyOf(tabla, tabla.length-1);
		}
		return borrado;
	}
	int buscar(Integer busca) {
		int indicar=-1;
		for(int i=0;i<tabla.length && indicar==-1;i++) {
			if (tabla[i].equals(busca)) {
				indicar=i;
				}
		}
		return indicar;

	}
	public int cantidad() {
		return tabla.length;
		
	}
	public void mostrar() {
		System.out.println("Lista: " + Arrays.toString(tabla));
	}
	
	
	
}

