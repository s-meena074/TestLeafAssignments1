package week1.day2;

import java.util.Arrays;

public class RemoveDuplicates
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String name= " We learn java basics as part of java sessions in java week1";
		String[] parts = name.split(" ");
		System.out.println("Given String: " +name);
		System.out.println("Given String in parts: ");
		for (String p:parts)
		{ 
			System.out.println(p); 
					
		}
		System.out.println(" ");
		System.out.print("After removing duplicate string: ");
		String dupjava = "java";
		for (int i = 0; i < parts.length; i++) 
		{
			if (parts[i].contains(dupjava))
			{
				parts[i]=parts[i].replace(dupjava, "");
			}
			System.out.print(" "+parts[i]);
		}
	}			
		
}

