package localdate;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class MainTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalTime ahora=LocalTime.now();
		System.out.println(ahora);
		System.out.println("Descanso "+ahora.getMinute());

		for(int i=1;i<10;i++) {
			ahora=ahora.plus(1,ChronoUnit.SECONDS);
			System.out.println(ahora);
		}
		int hora=ahora.getHour();
		int minutos=ahora.getMinute();
		int segundos=ahora.getSecond();
		
		for(int i=1;i<10;i++) {
			ahora=ahora.minus(1,ChronoUnit.HOURS);
			System.out.println(ahora);
		}
		
		//Pattern para mostrar milisegundos hh:mm:ss:SSS
		DateTimeFormatter formato=DateTimeFormatter.ofPattern("hh:mm:ss");
		System.out.println("La hora actual formateada es " +LocalTime.now().format(formato));
		
		
	}

}
