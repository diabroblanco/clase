package ejemploHerencia;



public class Persona {

	protected String nombre;
	protected byte edad;
	protected double estatura;
	
	public Persona(String nombre, byte edad,double estatura) {
		this.nombre=nombre;
		this.edad=edad;
		this.estatura=estatura;
	}
	public Persona() {}
		public String getNombre() {
			return nombre;
		}
	public void setNombre(String nombre){
		 this.nombre=nombre;
		
	}
	public byte getEdad() {
		return edad;
	}
	public void setEdad(byte edad) {
		 this.edad=edad;
	}
	public double getEstatura() {
		return estatura;
	}
	public void setEstatura(double estatura) {
		 this.estatura=estatura;
	}
	void mostrarDatos() {
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Edad: " + this.edad);
		System.out.println("Estatura: " + this.estatura);
		}
}
