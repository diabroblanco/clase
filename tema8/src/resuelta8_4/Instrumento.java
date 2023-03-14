package resuelta8_4;

import java.util.Arrays;

public abstract class Instrumento {
protected notaMusical[] cancion;
public Instrumento(notaMusical[] cancion) {
	cancion=this.cancion; 
	this.cancion=new notaMusical[0];
}
	public Instrumento() {
	// TODO Auto-generated constructor stub
}
	public notaMusical[] getCancion() {
	return cancion;
}
	 void add(notaMusical m) {
	cancion= Arrays.copyOf(this.cancion, this.cancion.length+1);
	cancion[cancion.length-1]=m;
	}
	abstract void tocar();
	
}
