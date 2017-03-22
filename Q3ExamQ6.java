import java.util.Scanner;
public class Q3ExamQ6 {
	//if (input.equals("a")||input.equals("b")||input.equals("c")||input.equals("d")||input.equals("e")||input.equals("f")||input.equals("g")||input.equals("h")||input.equals("i")||input.equals("j")||input.equals("k")||input.equals("l")||input.equals("m")||input.equals("n")||input.equals("o")||input.equals("p")||input.equals("q")||input.equals("r")||input.equals("s")||input.equals("t")||input.equals("u")||input.equals("v")||input.equals("w")||input.equals("x")||input.equals("y")||input.equals("z")||input.equals("A")||input.equals("B")||input.equals("C")||input.equals("D")||input.equals("E")||input.equals("F")||input.equals("G")||input.equals("H")||input.equals("I")||input.equals("J")||input.equals("K")||input.equals("L")||input.equals("M")||input.equals("N")||input.equals("O")||input.equals("P")||input.equals("Q")||input.equals("R")||input.equals("S")||input.equals("T")||input.equals("U")||input.equals("V")||input.equals("W")||input.equals("X")||input.equals("Y")||input.equals("Z"))
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard=new Scanner (System.in);
		System.out.println("Hello Joe. What jobs did you do today?:");
System.out.println("1. Oil change");
System.out.println("2. lube change");
System.out.println("3. radiator flush");
System.out.println("4. Transmission change");
System.out.println("5. Tire rotation");
System.out.println("6. Muffler replacement");
System.out.print("Press any n to show the total, and remember:always smile to customers $_$");//even better
int amount=0;
String a="1";
String input="1";
int oil = 0;
int lube=0;
int rad=0;
int trans=0;
int tire=0;
int muff=0;
double t=0;
do
{
	
input=keyboard.nextLine();



/**int oil1=keyboard.nextInt();
int lube1=keyboard.nextInt();
int rad1=keyboard.nextInt();
int trans1=keyboard.nextInt();
int tire1=keyboard.nextInt();
int muff1=keyboard.nextInt();
**/


if (input.equals("1"))
     oil++;
else if (input.equals("2"))
	lube++;
else if (input.equals("3"))
	rad++;
else if (input.equals("4"))
	trans++;
else if (input.equals("5"))
	tire++;
else if (input.equals("6"))
     muff++;
//else if (!input.equals("1")||!input.equals("2")||!input.equals("3")||!input.equals("4")||!input.equals("5")||!input.equals("6"))
	//System.out.print("re-enter");
}
while (!input.equals("n"));


	
	t=((26*oil)+(18*lube)+(30*rad)+(80*trans)+(20*tire)+(100*
			muff));
	double total=t+t*0.15;
	System.out.print("total price is: $"+total+"  tax is: "+t*0.15);





	
	}

}
