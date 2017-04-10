
public class school {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student student1=new student ("wayne","hsu");
		student1.setgrade(900);
		student1.setscore(900);
		student1.setlocker(9);
		student student2=new student ("jason","hsu");
		student2.setgrade(800);
		student2.setscore(00);
		student2.setlocker(7);
		teacher teacher1=new teacher ("john","cork");
		teacher1.setclasses("AP Computer");
		teacher1.setdepartment("computer science");
		teacher1.sethomeroom("A11");

		student1.info();
		student2.info();
		teacher1.info();
		
		student1.getemail();
		student2.getemail();
		teacher1.getemail();
		
		
		 
			
	}

}
