package resuelta7_9;

public class Bombilla {
	
	static public boolean interruptorGeneral=true;
	private boolean interruptor;
	
	public Bombilla() {
		this.interruptor=false;
	}
	public void encenderOapagar() {
		if(this.interruptor) {
			this.interruptor=false;
		}else {
			this.interruptor=true;
		}
	}
	public void encender() {
		this.interruptor=true;
	}
	public void apagar() {
		this.interruptor=false;
	}
	public boolean estado() {
		return interruptorGeneral && this.interruptor;
	}
	public String mostrarEstado() {
		return estado()? " Encendido ": " Apagado ";
	}
	
}
