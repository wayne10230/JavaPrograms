import java.util.Scanner;
public class converter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner (System.in);
		
		
		System.out.println("Enter a word");
		String letter=input.nextLine();
		System.out.println("You entered the word:"+letter);
		int lenght=letter.length();
		char ct = 0;
		for (int a=0;a<lenght;a++)
		{
		ct=letter.charAt(a);
		System.out.println(ct+" is "+(int)ct+ " in decimal.");
		StringBuffer b=getBinary(ct);
		
		System.out.println(ct+" is "+b.toString()+" in binary");
		}
		
		
		
		
	}
	public static StringBuffer getBinary(int ct){
		int div=(int)ct;
		String binary="";
		while (div>2){
			binary+=div%2;		   
			div=(int)div/2;
		    
		   
		             }
		binary+=div;
		StringBuffer sb= new StringBuffer(binary);
		
		return sb.reverse();
	}
	}



