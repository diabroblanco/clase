package resuelta7_10;
public class Vagon {
    static public int numIdentificacion=0;
    int cargaMaxima;
    int cargaActual;
    String mercancia;
    
    public Vagon(int numIdentificacion, int cargaMaxima, int cargaActual, String mercancia) {
    	numIdentificacion++;
    	this.cargaMaxima=cargaMaxima;
    	this.cargaActual=cargaActual;
    	this.mercancia=mercancia;
    	
    }
}
