package ejemploHerencia;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado yoEmpleado=new Empleado("Adrian",(byte) 25, 1.84, 0); {
			yoEmpleado.mostrarDatos();
			Persona yoPersona=new Persona("Adrian", (byte) 25, 1.84);
			yoPersona.mostrarDatos();
		}
	}

}
