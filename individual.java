
public class individual {
	
	protected String fname;
	protected String lname;
	protected int age;
	protected String email;
	
	public void reName (String first, String last)
	{
		fname=first;
		lname=last;
	}
	
	
	public void setage (int years)
	{
		age=years;
	}
	public void getemail ()
	{
	    
	    System.out.println(email);
	}
	public void setemail (String address)
	{
		email=address;
	}
	
	public individual (String first,String last)
	{
		fname=first;
		lname=last;
		
		String end="@pas.org";
		email=fname.charAt(0)+lname+end;
		
	}
}
