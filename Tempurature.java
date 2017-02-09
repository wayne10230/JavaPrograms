import java.util.Arrays;
import java.util.Scanner;
import java.util.*;
public class Tempurature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner (System.in);
		System.out.println("enter number tempueratures");
		int N=input.nextInt();
		int [] temps=new int [N];
		int t;
		double []abs_temps=new double[N];
		
		for (int i=0;i<N;i++)
		{
			System.out.println("Enter temperature #"+i);
			temps[i]=input.nextInt();
		  abs_temps[i]=Math.abs(temps[i]);
			if (temps[i]<0)
				abs_temps[i]+=0.1;
		}
		double min=1000.0;
		int position=0;
		for (int a=0;a<N;a++)
		{
			if (abs_temps[a]<min)
			{
			 min =abs_temps[a];
			 position=a;
		
			}
		}
		
			
		System.out.print("the minimum value is "+temps[position]);
		
	}

}
