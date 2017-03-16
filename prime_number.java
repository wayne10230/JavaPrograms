public class prime_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
boolean prime=true;
int c=1;
int a=2;
while (c<100)
{
	a++;
	for (int b=2;b<a;b++)
	{
		prime=true;
		if (a%b==0)
		{
			prime=false;
			break;
			
		}
		
	}
	if (prime==true)
		{
		c++;
		
			System.out.println("the "+picky(c)+" prime number is "+ a);
		}
}
	}
	public static String picky(int a)
	{
		String b=" ";
		if (a%10==1)
			b=a+"st";
		else if (a%10==2)
			b=a+"nd";
		else if (a%10==3)
			b=a+"rd";
		else 
			b=a+"th";
		
		
		
		return b;
		
	}

}
