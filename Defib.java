import java.util.*;
		import java.io.*;
		import java.math.*;

public class Defib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * Auto-generated code below aims at helping you parse
		 * the standard input according to the problem statement.0
		 **/
		
		        Scanner in = new Scanner(System.in);
		        String LON = in.next();
		        String LAT = in.next();
		        int N = in.nextInt();
		        LON=LON.replace(",","."); 
		         double LON_USER= Double.parseDouble(LON);
		          LAT=LAT.replace(",","."); 
		         double LAT_USER= Double.parseDouble(LAT);
		         double distance []=new double[N];
		         String name []=new String [N];
		        if (in.hasNextLine()) {
		            in.nextLine();
		        }
		        for (int i = 0; i < N; i++) {
		            String DEFIB = in.nextLine();
		            System.err.println(DEFIB);
		            String [] info=DEFIB.split(";");
		           
		            double LON_DEF=Double.parseDouble(info[4].replace(',','.'));
		            
		            double LAT_DEF=Double.parseDouble(info[5].replace(',','.'));
		            
		            
		            double x= (LON_USER-LON_DEF)*Math.cos((LAT_USER+LON_DEF)/2);
		            double y=LAT_USER-LAT_DEF;
		           distance[i]=Math.sqrt(x*x+y*y)*6371;
		           System.err.print("def# "+(i+1)+" is at: "+distance [i]+" km away");
		        
		        System.err.println(info);
		        System.err.println("LON is"+ info[4]+ "LAT is"+info[5]); 
		        name[i]=info [1];
		        }
		        int min_d=0;
		    
		        for (int i=0;i<N;i++)
		        {
		          
		         if (distance[i]<distance[min_d]) 
		          min_d=i;
		          System.err.println("the closest is: "+ min_d);
		         
		         
		        }
		        
		        
		        
		System.err.println("The user is at Lon: "+LON+" Lat: "+LAT); 
		        // Write an action using System.out.println()
		        // To debug: System.err.println("Debug messages...");

		        System.out.println(name[min_d]);
		    }
		
	}


