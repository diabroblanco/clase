package ejemploHerencia;

public class Empleado extends Persona{
	public double salario;
	public Empleado(String nombre, byte edad, double estatura, double salario) {
		super(nombre, edad, estatura);
		this.salario=salario;
	}
	public double getSalario() {
		return this.salario;
	}
	public void setSalario(double salario) {
		this.salario=salario;
	}
	@Override
	void mostrarDatos() {
		super.mostrarDatos();
		System.out.println("Salario: " +this.salario);
	}

	
}
