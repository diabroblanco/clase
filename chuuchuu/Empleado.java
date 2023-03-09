package chuuchuu;

public class Empleado {
	private static int id;
	protected String nombre;
	protected String dni;
	protected String telefono;
	protected double sueldo;
	private int idLocal;
	public Empleado() {
		asignarID();
	}
	
	
	public Empleado(String nombre, String dni, String telefono, double sueldo) {
		this.nombre=nombre;
		this.dni=dni;
		this.telefono=telefono;
		this.sueldo=sueldo;
		this.idLocal=asignarID();
		}
	static private int asignarID() {
		id++;
		return id;
	}

	static public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public double getSueldo() {
		return sueldo;
	}


	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	public void mostrarDatos() {
		System.out.println("El id es: " + this.idLocal);
		System.out.println("El nombre es: "+ this.nombre);
		System.out.println("El telefono es: "+ this.telefono);
		System.out.println("El dni es: "+ this.dni);
		System.out.println("El sueldo es: "+ this.sueldo);

	}
}
