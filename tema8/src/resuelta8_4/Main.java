package resuelta8_4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		notaMusical musica[]= {notaMusical.DO, notaMusical.SI,notaMusical.FA,notaMusical.SOL,notaMusical.RE};
		Piano p=new Piano();
		for(notaMusical nota:musica) {
			p.add(nota);
		}
		p.tocar();
	}

}
