package localdate;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Dime tu fecha de nacimiento: [dd-mm-aaaa]");
		String fechaN=sc.nextLine();
		String[] fechaNde=fechaN.split("-");
		String diaN=fechaNde[0];
		String mesN=fechaNde[1];
		String anioN=fechaNde[2];
		//convertir fecha de nacimiento en un objeto tipo LocalDate
		//parse->convierte
		fechaN=anioN+"-"+mesN+"-"+diaN;
		LocalDate fechaNNueva=LocalDate.parse(fechaN);
		LocalDate jubilacion=fechaNNueva.plus(70,ChronoUnit.YEARS);
		System.out.println(fechaNNueva.getDayOfWeek());
		LocalDate mas70=fechaNNueva.plus(70,ChronoUnit.YEARS);
		// ChronoUnit.YEARS * ChronoUnit.DAYS * ChronoUnit.MONTHS
		
		
		
		
		
		System.out.println("**************************");
		System.out.println("**************************");

		LocalDate hoy=LocalDate.now();
		System.out.println("Fecha de Nacimiento " +fechaN);
		System.out.println("Hoy es " +hoy);
		System.out.println(hoy.getDayOfWeek());
		System.out.println(hoy.getMonth());
		System.out.println(hoy.getYear());
		System.out.println(hoy.getDayOfMonth());
		System.out.println(hoy.getMonthValue());
		
		Period aniosJub=Period.between(jubilacion, hoy);
		
		System.out.println("Te faltan para 'Jubilarte' " +aniosJub);
		System.out.println("Dime la fecha de nacimiento de tu madre [yyyy-mm-dd]");
		LocalDate fechaMadre=LocalDate.parse(sc.nextLine());
		Period diferencia=Period.between(fechaNNueva, fechaMadre);
		System.out.println("Mi madre tenía " + diferencia );
		
		
		//Años bisiestos
		System.out.println("Dime una fecha cualquiera y compruebo si es bisiesto [yyyy-mm-dd]");
		LocalDate bisiesto=LocalDate.parse(sc.nextLine());
		boolean bisiestoR=bisiesto.isLeapYear();
		if (bisiestoR) {
			System.out.println("Es año bisiesto");
		}else {
			System.out.println("No es bisiesto");
		}
		//Formatear segun nuestra forma local-pattern ---patron
		DateTimeFormatter formato=DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(Locale.getDefault());
		System.out.println(hoy.format(formato));
		DateTimeFormatter formato2=DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).withLocale(Locale.getDefault());
		System.out.println(hoy.format(formato2));
		DateTimeFormatter formato3=DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).withLocale(Locale.getDefault());
		System.out.println(hoy.format(formato3));
		DateTimeFormatter formato4=DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.getDefault());
		System.out.println(hoy.format(formato4));
		DateTimeFormatter formato0=DateTimeFormatter.ofPattern("dd-MM-yy");
		System.out.println(hoy.format(formato0));
		
	}

}
