
import java.util.Scanner;
public class Plural {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard=new Scanner(System.in);
		
		System.out.print("Enter a singular noun");
		String sin=keyboard.nextLine();
		
		int length1=sin.length();
		int length=length1-1;
		
			char deter=sin.charAt(length);
		
		char deter1=sin.charAt(length-1);
		
		if (!sin.equals("wolf")&&!sin.equals("alga")&&!sin.equals("axis")&&!sin.equals("basis")&&!sin.equals("bizon"))
		{
			if (deter1!='a'&&deter1!='e'&&deter1!='i'&&deter1!='o'&&deter1!='u'&&deter=='y')
			{
				sin=sin.replace("y","ies");
				System.out.print(sin);
			}
		
		
			else
			{
				if (deter=='h'||deter1=='s'||deter1=='c'||deter=='s'||deter=='x'||deter1=='z')
					System.out.print(sin+"es");
				else 
					System.out.print(sin+"s");
			}
		}
		else
		{
			if (sin.equals("wolf"))
				System.out.print("wolves");
			if (sin.equals("alga"))
				System.out.print("algae");
			if (sin.equals("axis"))
				System.out.print("axes");
			if (sin.equals("basis"))
				System.out.print("bases");
			if (sin.equals("bizon"))
				System.out.print("bison");
		}
		//there are 106 irregular forms"
		  
		 
		 
		
	}

}
