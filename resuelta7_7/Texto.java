package resuelta7_7;	
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
public class Texto {
		private String cad;
		LocalDate creacion;
		LocalDateTime ultimaModificacion;
		private final int LONGITUD_MAX;
		static final String VOCALES="aeiouáéíóú";
		
		public Texto(int longitud) {
			LONGITUD_MAX=longitud;
			this.cad="";
			creacion=LocalDate.now();
			ultimaModificacion=null;
			
		}
		public void addFinal(char c) {
			if(LONGITUD_MAX>this.cad.length()) {
				this.cad=this.cad+c;
				this.ultimaModificacion=LocalDateTime.now();
			}
			
		}
	
		public void addFinal(String cadena) {
			if (LONGITUD_MAX>=this.cad.length()+cadena.length()) {
				this.cad=this.cad+cadena;
				this.ultimaModificacion=LocalDateTime.now();
			}
		}
		public void addInicio(char c) {
			if(LONGITUD_MAX>this.cad.length()) {
				this.cad=c+this.cad;
				this.ultimaModificacion=LocalDateTime.now();
			}
		}
		public void addInicio(String cadena) {
			if(LONGITUD_MAX>this.cad.length()+cadena.length()) {
				this.cad=cadena+this.cad;
				this.ultimaModificacion=LocalDateTime.now();
			}
		}
		public void mostrar() {
			DateTimeFormatter formato0=DateTimeFormatter.ofPattern("dd/MM/yy");
			System.out.println("Texto creado el "+this.creacion.format(formato0));
			DateTimeFormatter formato1=DateTimeFormatter.ofPattern("dd/MM/yy' Hora: ' hh:mm:ss");

			System.out.println("Ultima modificación "+ this.ultimaModificacion.format(formato1));
			System.out.println(this.cad);
		}
		
}
