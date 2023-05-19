package Challenge;

import java.util.HashSet;

public class MostDuplicate 
{
	public static char FirstDup(char s[]) 
	{
		// TODO Auto-generated method stub
		HashSet<Character> dup = new HashSet<>(); 
		for (int i=0; i<s.length-1 ; i++) 
		{ char ch = s[i]; 
			if(dup.contains(ch))
			{ 
				return ch; 
			} 
			else	
			{
				dup.add(ch); 
			} 
			
	}
		return 0; 
	
}
		public static void main(String[] args)
		{
			String s1 = "abccbaacz"; 
			char[] arr = s1.toCharArray();
			System.out.println("Fist most duplicate:" +FirstDup(arr)); 
		}
	

}
