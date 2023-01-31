package SegundoProyecto;

import java.util.Scanner;

public class cuentadias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int dia, mes, año;
		boolean fechacorrecta;
		System.out.print("Introduzca día ");
		dia = sc.nextInt();
		System.out.print("Introduzca mes ");
		mes = sc.nextInt();
		System.out.print("Introduzca año ");
		año = sc.nextInt();
		if (año == 0) {
			fechacorrecta = false;
		} else {
			if (mes == 2 && (1 <= dia && dia <= 28)) {
				fechacorrecta = true;
			} else {
				if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && (1 <= dia && dia <= 30)) {
					fechacorrecta = true;
				} else {
					if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12)
							&& (1 <= dia && dia <= 31)) {
						fechacorrecta = true;
					} else {
						fechacorrecta = false;
					}
				}

				if (fechacorrecta) {
					System.out.println("Fecha OK: " + dia + "/" + mes + "/" + año);
				} else {
					System.out.println("Fecha incorrecta");
				}

			}
		}
	}
}