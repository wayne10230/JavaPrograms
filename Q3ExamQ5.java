import java.util.Scanner;
public class Q3ExamQ5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner keyboard=new Scanner(System.in);

System.out.println("Enter an integer number");
int un=keyboard.nextInt();
int []table=new int[20];
for (int a=0;a<=10;a++)
{
	if (a==0)
	{
		table[a]=un;
		
	}
	else 
		{
		table[a]=un*a;
		
		}
	
}
int[] finaltable=new int[10];
int c=0;
for (int b=1;b<=10;b++)
{
    
    finaltable[c]=table[b];
    c++;
}

for (int d=0;d<10;d++)
	System.out.print(" "+finaltable[d]);
	}

}
