import java.util.Scanner;
public class Thor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int lX = in.nextInt(); // the X position of the light of power
        int lY = in.nextInt(); // the Y position of the light of power
        int TX = in.nextInt(); // Thor's starting X position
        int TY = in.nextInt(); // Thor's starting Y position
        String dir="";
        // game loop
        while (true) {
            int remainingTurns = in.nextInt(); // The remaining amount of turns Thor can move. Do not remove this line.

            // Write an action using System.out.println()
            System.err.format("Inputs are: light %d-%d, Thor:%d-%d", lX, lY, TX, TY);
          if (TY!=lY)
          {
               if (TY>lY){
                   if(TY>0){
                    dir="N";
                    TY-=1;
                   }
               }else {
                    if (TY<17){
                     dir="S";
                     TY+=1;
                    }
                }
                
             }
          
           if (TX!=lX)     
          {
               if (TX>lX){
                    if (TX>0){           
                         dir+="W";
                         TX-=1;
                    }
               }
           
           else {
                if (TX<39){
                     dir+="E";
                     TX+=1;
                }
           }
          }
          
         
           
             
               
            
               
            // A single line providing the move to be made: N NE E SE S SW W or NW
            System.out.println(dir);
            dir="";
        }
    }
	}


