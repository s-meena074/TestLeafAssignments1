package Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		
		Set<Integer> set = new TreeSet<>();
		for (int i=0; i< data.length; i++)
		{
			 set.add(data[i]);
		}
		//System.out.println(set);
		List<Integer> list = new ArrayList<>(set); 
		Collections.sort(list);
		System.out.println("List:" +list);
		System.out.println("Size of List:" +list.size());
		System.out.println("Printing Second Last Element :"+list.get(4));
		
		
		
	}


}
