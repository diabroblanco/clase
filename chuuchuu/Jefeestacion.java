package chuuchuu;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;
public class Jefeestacion extends Empleado{
 private LocalDateTime nombramiento;
	DateTimeFormatter formato1=DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL,FormatStyle.MEDIUM).withLocale(Locale.getDefault());

 
 public Jefeestacion() {
	this.nombramiento=LocalDateTime.now();
	
	// TODO Auto-generated constructor stub
}

public Jefeestacion(String nombre, String dni, String telefono, double sueldo) {
	super(nombre, dni, telefono, sueldo);
	// TODO Auto-generated constructor stub
	this.nombramiento=LocalDateTime.now();
}

public LocalDateTime getNombramiento() {
	return nombramiento;
}

public void setNombramiento(LocalDateTime nombramiento) {
	this.nombramiento = nombramiento;
}
  @Override
  public void mostrarDatos() {
	  super.mostrarDatos();
	  System.out.println("Fecha nombramiento: "+ this.nombramiento.format(formato1));
  }
}
