package week1.day2;

public class Palindrome 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String str = "madam";
		String rstr = "";
		char c; 
		for (int i=0; i<str.length(); i++)
	      {
	        c= str.charAt(i); 
	        rstr= c+rstr; 
	      }
		if (str.equalsIgnoreCase(rstr))
		{
			System.out.println("Palindrome: "+ rstr);
		}
		
	}

}
