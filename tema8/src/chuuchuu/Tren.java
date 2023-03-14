package chuuchuu;

import java.util.Arrays;

public class Tren {
	Locomotora locomotora;
	Vagon vagones[];
	Maquinista responsable;
	
	private int numVagones;
	
	public Tren(Locomotora locomotora,Maquinista responsable) {
		this.locomotora=locomotora;
		this.responsable=responsable;
		vagones=new Vagon[5];
		this.numVagones=0;
	}
	public void enganchaVagon(int cargaMax, int cargaActual, String mercancia) {
		if(this.numVagones>=5) {
			System.out.println("El tren no admite más vagones");
		}else {
			Vagon v=new Vagon(numVagones, cargaMax, cargaActual, mercancia);
			this.vagones[this.numVagones]=v;
			++this.numVagones;
		}
	}
public void mostrarTren() {
	System.out.println("El tren tiene "+ numVagones+ " vagones.");
	System.out.println("Los vagones tienen: ");
	for(Vagon va:vagones) {
		if(va==null) {
			break;
		}else {
		System.out.println("Carga Actual: "+ va.getCargaActual());
		System.out.println("Carga Máxima: "+ va.getCargaMaxima());
		System.out.println("Carga Mercancia: "+ va.getMercancia());
		System.out.println("Carga Maquinista: "+ responsable.getNombre());
		System.out.println("Matricula de la locomotora "+ locomotora.getMatricula());

	}
}
	
}
}
