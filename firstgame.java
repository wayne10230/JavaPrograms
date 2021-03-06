
import processing.core.PApplet;
import processing.core.PImage;
public class firstgame extends PApplet {
 private double dragCoef=0.9;
	private int h=400;
	private int w=400;
	private int posx;
	private int posy;
	private int sqh=50;
	private int sqw=50;
	private int sqx=100;
	private int sqy=100;
	private int speed=10;
	private int cnt=0;
	private int cnthit=0;
	private String direction="wait";
	PImage img;
	PImage meatboy;
	PImage mt0;
	int numRImg=7;
	int numDImg=6;
	int numUImg=6;
	int numLImg=6;
	double speed1=10;
	double angle=(Math.PI/4);
	
	PImage [] mbR=new PImage[numRImg];
	PImage [] mbD=new PImage[numDImg];
	PImage [] mbU=new PImage[numUImg];
	PImage [] mbL=new PImage[numLImg];
	
	public void bounce ()
	{
		
	           if (sqx<5)
	           {	   
	        	   sqx=0;
	        	   angle=Math.PI-angle;
	               speed1*=dragCoef;
	               cnthit++;
	           }
	       
			
		
	    	   if (sqx>w-sqw)
	    	   {   
	    		   sqx=w-sqw;
	    		   angle=Math.PI-angle;
	    		   speed1*=dragCoef;
	    		   cnthit++;
	    	   }
	      
			
	    	   if (sqy<0)
	    	   { 
	    	   sqy=0;
	    	   angle=Math.PI-angle;
	    	   speed1*=dragCoef;
	    	   cnthit++;
	    	   }
	       
	    	   if (sqy>w-sqh-15)
	    	   {
	    		   sqy=w-sqh-15;
		    	   angle=-angle;
		    	   speed1*=dragCoef;
		    	   cnthit++;
	    	   }
	    	  
	    	   if (sqy<5)	   
	    	   {
	    		   sqy=5;
		    	   angle=Math.PI+angle;
		    	   speed1*=dragCoef;
		    	   cnthit++;
	    	   }
	    	   if (sqy>h-sqh)
	    	   {  
	    		   sqy=h-sqh;
	    		   angle=Math.PI-angle;
	    		   speed1*=dragCoef;
	    		   cnthit++;
	    	   }
	    	   
	}
	public void move ()
	{
		sqx+=(int) (speed1*Math.cos(angle));
		sqy+=(int) (speed1*Math.sin(angle));
		
	}
	
	
	public void settings ()
	{
		
		size (w,h);
		
		meatboy=loadImage("meatboy.png");
		for (int i=0;i<numRImg;i++)
		{
			mbR[i]=loadImage("right"+(i+1)+".png");
					
				
		}
		for (int i=0;i<numLImg;i++)
		{
			mbL[i]=loadImage("left"+(i+1)+".png");
					
				
		}
		for (int i=0;i<numDImg;i++)
		{
			mbD[i]=loadImage("down"+(i+1)+".png");
					
				
		}
		for (int i=0;i<numUImg;i++)
		{
			mbU[i]=loadImage("back"+(i+1)+".png");
					
				
		}
		mt0=loadImage ("mt0.png");
	
	}
	
	public void setup()
	{
		background (255);
		frameRate(20);
	}
	
	public void keyPressed ()
	{
		
		
       
		if (key=='a')
       {
    	   sqx-=speed;
           if (sqx<0)
        	   sqx=0;
           direction="left";
           
       }
       
		
		if (key=='d')
       {
    	 
    	   sqx+=speed;
    	   if (sqx>w-sqw)
    		   sqx=w-sqw;
    	   direction="right";
    	   System.out.print("going right");   	
        	
       }
      
		
		if (key=='w')
       {
    	   sqy-=speed;
    	   if (sqy<0)
    		   sqy=0;
    	   direction="up";
       }
       if (key=='s')
       {
    	   sqy+=speed;
    	   if (sqy>h-sqh)
    		   sqy=h-sqh;
    	  direction="down";
       }
		
	}
	
	public void draw()
	{
		cnt++;
		background (255);
		stroke (255,0,0);
		fill (170,57,57);
		//rect(sqx, sqy, sqw, sqh);
		
		
		stroke (0,68,0);
		fill(95,174,87);
		//ellipse(height/4, width/4, 100,100);
		
		if (direction.equals ("right"))
		{
			int i=cnt%numRImg;
			if (i<(numRImg+1))
				
				img=mbR[i];
			System.out.println(i);
		}
		
		if (direction.equals("wait"))
			{
			img=meatboy;}

		if (direction.equals ("down"))
		{
			int i=cnt%numDImg;
			if (i<(numDImg+1))
				{
				img=mbD[i];}
			System.out.println(i);
		}
		
		if (direction.equals ("up"))
		{
			int i=cnt%numUImg;
			if (i<(numUImg+1))
				{
				
				img=mbU[i];
				}
			System.out.println(i);
		}

		if (direction.equals ("left"))
		{
			int i=cnt%numLImg;
			if (i<(numLImg+1))
				{
				
				img=mbL[i];
				}
			
		}
		if (cnthit>10)
		{	img=mt0;
			speed1=0;
		
		}
		img.resize (40,60);
		image(img,sqx,sqy,56,76);
		
		direction="wait";
		
		
		move();
		bounce();
		System.out.println(cnthit);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     PApplet.main("firstgame",args);
	}
}