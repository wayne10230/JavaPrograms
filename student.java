
public class student extends individual{
	private int grade;
	private int score;
	private int locker;
	
	public void getgrade () 
	{
		
		System.out.println(grade);
	}
	public void setgrade (int level)
	{
		grade=level;
	}
	
	public void setscore (int number)
	{
		score=number;
	}
	public void getscore ()
	{
		System.out.print(score);
	}
	public void setlocker (int loc)
	{
	   locker=loc; 
	}
	public void info ()
	{
		System.out.println(fname+" "+lname+ "is at grade " +grade+ " and has a score of "+score+"with locker number:"+locker);
	}

	
	
	public student (String first,String last)
	{
		super(first,last);
		
		String end="@student.pas.org";
		email=fname.charAt(0)+lname+end;
		
	}
}

