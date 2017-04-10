
public class teacher extends individual{
	


	private String classes;
	private String department;
	private String homeroom;
	
	public void setclasses (String name) 
	{
		
		classes=name;
	}
	public void setdepartment (String word)
	{
		department=word;
	}
	
	public void sethomeroom (String room)
	{
		homeroom=room;
	}
	public void info ()
	{
		System.out.println(fname+" "+lname+ "is at" +department+ " and has classes:"+classes+"with homeroom number:"+homeroom);
	}
	
	
	
	public teacher (String first,String last)
	{
		super(first,last);
		
		String end="@teacher.pas.org";
		email=fname.charAt(0)+lname+end;
		
	}
}