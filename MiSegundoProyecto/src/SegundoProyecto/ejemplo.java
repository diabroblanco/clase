package SegundoProyecto;

public class ejemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		switch(a+1) {
		case 0:
			a=2;
		case 1:
			a=3;
		case 2:
			a++;
			break;
		case 3:
			a--;
			break;
		}
		System.out.println("El valor de a " +a);
	}

}
