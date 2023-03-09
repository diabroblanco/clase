package chuuchuu;

import java.util.ArrayList;

import chuuchuu.Mecanico.Especialidad;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Empleado> misEmpleados=new ArrayList<Empleado>();
		Maquinista unMaquinista=new Maquinista("Paco", "0012", "677432", 2800.1, "Maquinista Jefe");
		misEmpleados.add(unMaquinista);
		System.out.println("******************");
		Mecanico unMecanico=new Mecanico("Jose", "00000", "655555", 1080.0, Especialidad.ELECTRICIDAD);
		misEmpleados.add(unMecanico);
		System.out.println("******************");
		Jefeestacion jefe=new Jefeestacion("Diego", "556423", "6548234",1080.0);
		misEmpleados.add(jefe);
		Jefeestacion unJefeestacion2=new Jefeestacion("Adrian","165498","182381", 2500.0);
		
		for(Empleado e:misEmpleados) {
				e.mostrarDatos();
				System.out.println("****************************");
		}
		System.out.println("********DESDE AQUI TREN********");
		Locomotora unaLocomotora=new Locomotora("15616", 1500, 2005, unMecanico);
		Tren miTren=new Tren(unaLocomotora, unMaquinista);
		miTren.enganchaVagon(122, 430, "Cajas");
		miTren.enganchaVagon(342,112, "Pescado");
		miTren.mostrarTren();
		
		
	}

}
