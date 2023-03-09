package chuuchuu;



public class Locomotora {
	private String matricula;
	private int potencia;
	private int antiguedad;
	Mecanico mecanico;
	
	public Locomotora(String matricula, int potencia, int antiguedad, Mecanico mecanico) {
		this.matricula=matricula;
		this.potencia=potencia;
		this.antiguedad=antiguedad;
		this.mecanico=mecanico;
}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	public Mecanico getMecanico() {
		return mecanico;
	}

	public void setMecanico(Mecanico mecanico) {
		this.mecanico = mecanico;
	}
	
}
