import processing.core.PApplet;
import java.util.*;

public class game2048 extends PApplet {

	public int space=10;
	public int numblock=4;
	public int block=((500-2*space)-(numblock+1)*space)/numblock;
	public int[]currb={0,0};
	public int []change={0,1};
	
	public static void main(String[] args) 
	{
		PApplet.main("game2048",args);
    }
	
	public void settings ()
	{
		size (500,500);
	}
	
	public void  setup()
	{
		textFont(createFont("Courier",14));
	}
	
	public void keyPressed () 
	{
		int change[]={0,0};
		int xlim=3;
		int ylim=0;
		
		if( keyCode==UP)
		{
			change[1]=-1;
			
		}
		if( keyCode==DOWN)
		{
			change[1]=+1;
		}
		if( keyCode==RIGHT)
		{
			change[0]=+1;
		}
		if( keyCode==LEFT)
		{
			change[0]=-1;
		}
		
		
		currb[1]+=change[0];
		currb[0]+=change[1];
		
		if (currb[1]>=xlim)
		{
			currb[1]=3;
		}
		if (currb[1]<=ylim)
		{
			currb[1]=0;
		}
		
		if (currb[0]>=xlim)
		{
			currb[0]=3;
		}
		if (currb[0]<=ylim)
		{
			currb[0]=0;
		}
		
	}
	
	public void draw ()
	{
		int i;
		int j;
		background(256);
		fill(19,50,83);
		rect(10,10,width-20,height-20,10);
		
		
			//fill(255,13,0);
			//rect(2*space,2*space,block,block,10);
			//System.out.print(block);
		for (j=0;j<=numblock-1;j++)
		{
			
			
		 for (i=0;i<=numblock-1;i++)
		
		 	{
			 int s=10;
			 if (j==currb[0]&& i==currb[1])
			 {
				 fill(255,0,0);
			 }
			 else	
			 {
				 fill(203,203,203);
			 }
			 	
			 	rect((2+i)*s+i*block,(2+j)*s+j*block,block,block,10);
		
		 	}
		}
	}

}
