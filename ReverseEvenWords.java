
package week1.day2;

public class ReverseEvenWords 
{

	public static void main(String[] args) 
	{
		String str= "I am a Software Tester";
		String[] parts = str.split(" ");
		
		for (int i = 0; i < parts.length; i++) 
		{ 
			if (i % 2 != 0)
			{
		char ch[] = str.toCharArray();
		System.out.println(parts[i]);
		parts[i] = "";
	      int ln = ch.length;
	      for (int j=ln-1; j >=0; j--)
	      System.out.print(ch[i]);
			}
	}

}}
