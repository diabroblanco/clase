package main;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=15;i++) {
			if (esprimo(i)) {
				System.out.println(i+" es Primo");
			}else {
				System.out.println(i+ " es Compuesto");
			}
		}
	}

	static boolean esprimo(int num){
		boolean primo=true;
	
	int i=2;
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
}
