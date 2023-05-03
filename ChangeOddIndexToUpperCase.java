package week1.day2;

import java.util.Arrays;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String test = "changeme";
		char[] testArray = test.toCharArray();
		int ln = testArray.length;
		
		System.out.print("Reversed String:");
		  for (int i=ln-1; i >=0; i--)
	      System.out.print(testArray[i]);
		  System.out.println(" ");
		  System.out.print("Change OddIndex ToUpper Case: ");
			for (int i =0; i< testArray.length; i++)
		{  
//			System.out.println(testArray[i]);
			if (i%2==0)
			{
				testArray[i]= Character.toUpperCase(testArray[i]);
			}
			System.out.print(testArray[i]);

		}
		
		// TODO Auto-generated method stub
		
}
}
