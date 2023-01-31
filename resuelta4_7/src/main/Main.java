package main;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Divisores primos de 24: "+ divisores(24));
	}
	static boolean esPrimo(int num){
		boolean primo=true;
		
		int i=3;
		if (num<2){
			primo=false;
		}
		while (i<num && primo ==true) {
			if(num%i==0) {
				primo=false;
			}
			i++;
		}
		return(primo);
	}
	static int divisores(int num) {
		int cont=0;
		for(int i=2;i<=num;i++) {
			if(esPrimo(i) && num% i==0) {
				cont++;
			}
		}	return(cont);
		}
}


	
