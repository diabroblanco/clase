package chuuchuu;

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

	public static int getNumIdentificacion() {
		return numIdentificacion;
	}

	public static void setNumIdentificacion(int numIdentificacion) {
		Vagon.numIdentificacion = numIdentificacion;
	}

	public int getCargaMaxima() {
		return cargaMaxima;
	}

	public void setCargaMaxima(int cargaMaxima) {
		this.cargaMaxima = cargaMaxima;
	}

	public int getCargaActual() {
		return cargaActual;
	}

	public void setCargaActual(int cargaActual) {
		this.cargaActual = cargaActual;
	}

	public String getMercancia() {
		return mercancia;
	}

	public void setMercancia(String mercancia) {
		this.mercancia = mercancia;
	}
    
}
