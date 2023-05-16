package Assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] nums = { 9, 8, 6, 2, 3, 1, 5, 8, 4, 10 };
		Set<Integer> number = new TreeSet<Integer>();
		for (int i = 0; i < nums.length; i++) {

			number.add(nums[i]);
		}
		List<Integer> list = new ArrayList<Integer>(number);
		
		for (int i = 0; i < list.size()-1; i++) {

			if (list.get(i) == list.get(i + 1) - 1) {
				continue;
			} 
			else
			{
				System.out.println("Missing number in list is :" + (list.get(i) + 1));
			}
			
		}
	}

}
