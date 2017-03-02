
public class RTO13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String um="this is a secret";
char character=0;
int number=0;
char a=0;
String message=" ";


for (int n=0;n<um.length();n++)
{
	character=um.charAt(n);
	
	number=(int)character;
	
	number+=13;
	a=(char)number;
	message+=a;
	
	
	
}

System.out.print(message);
	}

}
