package Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		

			String[] sample = { "HCL", "Wipro", "Aspire Systems", "CTS" };
			List<String> list = new ArrayList<String>();
			for (int i = 0; i < sample.length; i++) 
			{
				list.add(sample[i]);
			}

			Collections.sort(list);
			int size = list.size();
			for (int i = 0; i <= size-1; i++) 
			{

				System.out.print(list.get(i) + " ");
			}


	}

}
