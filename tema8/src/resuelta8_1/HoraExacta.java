package resuelta8_1;

public class HoraExacta extends Hora {
		protected int segundos;
		public HoraExacta(int hora, int minutos, int segundos) {
			super(hora, minutos);
			this.segundos=segundos;
			if(!setSegundos(segundos)) {
				System.out.println("Segundos MAAAAAAL");
			}
		}
		public int getSegundos() {
			return segundos;
		}
		public boolean setSegundos(int segundos) {
			boolean correcto=false;
			if(0<=segundos && segundos<60) {
				this.segundos = segundos;
				correcto=true;
			}
			return correcto;
		}
	@Override
	public void incrementar() {
		segundos++;
		if(segundos>59) {
			segundos=0;
			super.incrementar();
		}
	}
	@Override
	public String toString() {
		String resultado=super.toString();
		resultado +=":"+segundos;
		return resultado;
	}
	@Override
	public boolean equals(Object o) {
		HoraExacta otroReloj=(HoraExacta) o;
		boolean iguales;
		if(this.hora==otroReloj.hora && this.minutos==otroReloj.minutos && this.segundos==otroReloj.segundos) {
			iguales=true;
		}else {
			iguales=false;
		}
		return iguales;
	}
}
