/**
 * 
 * @author Adrián
 * @descripcion Evitar desbordamiento con short
 * @ejercicio 1.5
 *
 */
public class Desbord {
	public static void main(String[] args) {
	short num;
	num = 32767;
	System.out.println("Valor máximo para el tipo short: " + num);
	num++;
	System.out.println("Valor mínimo para el tipo short: " + num);
	}
}
