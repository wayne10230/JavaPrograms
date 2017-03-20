import java.util.Scanner;
public class Arepeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String score;
int number = 0;
double average;
char repeat;
String input;
int a = 0;
Scanner keyboard=new Scanner (System.in);





while (true)
{
	a++;
	System.out.println("Enter a score or any letter to show average");
	score=keyboard.nextLine();
	
	try
	{
		number+=Integer.parseInt(score);
		
	}
	catch (NumberFormatException e)
	{
		average=number/a;
	    System.out.println("average is:"+average);
	    System.exit(0);
	}
	
	
}
    
   

	}

}
