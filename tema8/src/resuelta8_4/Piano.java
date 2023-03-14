package resuelta8_4;

public class Piano extends Instrumento{

	
public Piano() {
		super();
		// TODO Auto-generated constructor stub
	}

@Override
public void tocar() {
	for(notaMusical nota:cancion) {
		switch(nota) {
		case DO->System.out.println("do");
		case RE->System.out.println("re");
		case MI->System.out.println("mi");
		case FA->System.out.println("fa");
		case SOL->System.out.println("sol");
		case LA->System.out.println("la");
		case SI->System.out.println("si");
		}
	}
	System.out.println("");
}
	
}
