package ejercicio7_6;

public class Horas {
private int hora;
private int minutos;
private int segundos;
public int getHora() {
	return hora;
}
public void setHora(int hora) {
	if(0<=hora && hora<=23) {
	this.hora=hora;
	}else {
		this.hora=hora;
	}
}
public int getMinutos() {
	return minutos;
}
public void setMinutos(int minutos) {
	if(0<=minutos && minutos<=59) {
	this.minutos=minutos;
	}else {
		this.minutos=0;
	}
}
public int getSegundos() {
	return segundos;
}
public void setSegundos(int segundos) {
	if(0<=segundos && segundos<=59) {
		this.segundos=segundos;
		}else {
			this.segundos=0;}}

public void incrementarSegundos() {
	// TODO Auto-generated method stub
	this.segundos++;
	if(this.segundos>59) {
		this.segundos=0;
		this.minutos++;
		if(this.minutos>59) {
			this.minutos=0;
			this.hora++;
			if(this.hora==24) {
				this.hora=0;
				}
}
		}
		}
}
