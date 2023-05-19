package Challenge; // Java challenge 8/20

import java.util.Arrays;

public class ArraySetTrueofFalse 
{
	public static boolean containsDuplicate(int a[])
			{	Arrays.sort(a); 
				for (int i=0; i<a.length;i++) 
				{
					for (int j= 0; j<a.length; j++)
					{
						if(a[i] == a[j])
						{	return false; 		}
					
						else 
							{ j = j+i; }
					}
				}
				return false;
				
			}	
			public static void main(String[] args)
			{
				int array[] = {7, 6, 4,3,5,2,1}; 
				System.out.print("Given Arrayset is:"); 
				System.out.println(containsDuplicate(array)); 
			}
	
}
