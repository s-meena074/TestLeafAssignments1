package Challenge; // Java Challenge 9/20

public class IndexNonRepeatingChar 
{

	public static int indexofNonRepeatingChar(String str)
	{
		for (char i : str.toCharArray())
		{
			if (str.indexOf(i)== str.lastIndexOf(i))
					{
						return (str.indexOf(i)); 
						
					}
		} return -1;
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		//String s = "aabb"; 
		//String s = "loveleetcode";
		String s = "leetcode";
		System.out.println(indexofNonRepeatingChar(s));
		
		
		
	}

}
