
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="00 000 0 0 00 0";  
		String[] words=s1.split("\\s");//splits the string based on whitespace  
		//using java foreach loop to print elements of string array  
		for(String w:words){  
		 
		}
		String binary="";
		int nextblock =0;
		
		if (words[0]=="00")		
		 {
			
			nextblock= 1;
			}
		else 
			{
			nextblock=0;
			}
		
			
		for (int k=1;k<words.length;k+=2)
		{
			if (nextblock==0)
			{
				for (int a=1; a<=words[k].length();a++)
				{
				binary+='1';
				}
				nextblock=1;
			}
			
			else 
			{
				for (int a=1; a<=words[k].length();a++)
				{
					binary+='0';
			
				}
				nextblock=0;
			}
		
		
			
		}
		System.out.print(binary);
	}
	

}
