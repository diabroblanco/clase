package ejercicio7_8;

public class SintonizadorFM {

	private double frecuencia;
	
	public SintonizadorFM(double frecuencia) {
		if(frecuencia<80) {
			this.frecuencia=80;
		}
		else if (frecuencia>108){
			this.frecuencia=108;
		}
		else {
			this.frecuencia=frecuencia;
		}
	}
	public  SintonizadorFM(){
		this.frecuencia=80;
	}
	public void setFrecuencia(double frecuencia) {
		this.frecuencia=frecuencia;
	}
	
	public double down() {
		this.frecuencia -=0.5;
		comprobarFrecuencia();
		return this.frecuencia;
	}
	public double up() {
		this.frecuencia +=0.5;
		comprobarFrecuencia();
		return this.frecuencia;
	}
	private void comprobarFrecuencia() {
		if(this.frecuencia<80) {
			this.frecuencia=108;
		}else if (this.frecuencia>108) {
			this.frecuencia=80;
			
		}
	}
	public void display() {
		System.out.println("Sintonizando: " +this.frecuencia+ " MHz ");
	}
}
