
public class Ascii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String binary="111010011011111100100110000111110011111001";
		String s2=" ";
		char nextChar;
		int bitsPerAscii=7;
		int num_chars=binary.length()/bitsPerAscii;
		String [] ascii=new String [num_chars];
		
		for (int n=0; n<num_chars;n++)
		{
			nextChar=(char)Integer.parseInt(binary.substring(bitsPerAscii*n,bitsPerAscii*n+bitsPerAscii), 2);
			s2+=nextChar;
			
			
		}
		System.out.print(s2);
					
				
				
	}

}
