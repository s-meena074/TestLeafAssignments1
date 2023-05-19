package Challenge;

public class Jewels 
{
	public static int jewel(String jewels, String stones)
	{
		int count = 0; 
		char[]  jewelChar = jewels.toCharArray(); 
		char[] stoneChar = stones.toCharArray(); 
		for (int i=0; i<jewelChar.length; i++)
		{
			for( int j=0; j<stoneChar.length; j++)
			{ 
			if (jewelChar[i] == stoneChar[j])
			count++; 
			} 
		} return count; 
		 
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//String jewels = "aA"; 
		String stones = "aAAbbbbb"; 
		String jewels = "zZZ"; 
		//String stones = "ZZ"; 
		System.out.println(jewel(jewels, stones));
	}

}
