package chuuchuu;

public class Mecanico extends Empleado{
		public enum Especialidad{FRENOS, HIDRAULICA, ELECTRICIDAD, MOTOR}
		private Especialidad especialidad;
		public Mecanico() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Mecanico(String nombre, String dni, String telefono, double sueldo, Especialidad espe) {
			super(nombre, dni, telefono, sueldo);
			// TODO Auto-generated constructor stub
			this.especialidad=espe;
		}

		public Especialidad getEspecialidad() {
			return especialidad;
		}

		public void setEspecialidad(Especialidad especialidad) {
			this.especialidad = especialidad;
		} 
		@Override
		public void mostrarDatos() {
			super.mostrarDatos();
			System.out.println("Especialidad:" +this.especialidad);
		}

		@Override
		public String toString() {
			return "Mecanico [especialidad=" + especialidad + ", nombre=" + nombre + ", dni=" + dni + ", telefono="
					+ telefono + ", sueldo=" + sueldo + "]";
		}
		
		
		
	
}
