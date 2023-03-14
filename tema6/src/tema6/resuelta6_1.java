package tema6;

public class resuelta6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for( int codePoint=0x0000;codePoint<=0xFFFF;codePoint++) {
			String hexa=Integer.toHexString(codePoint);
			System.err.println("\\u "+ hexa+" : "+ (char)codePoint);
		}
	}

}
