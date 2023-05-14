package Assignments;

public class MultipleStudents 
{

	public void getstudinfo(int a, String b ) 
	{
		System.out.println(a);
		System.out.println(b);
		
	}
	public void getstudinfo(String a, long b ) 
	{
		System.out.println(a);
		System.out.println(b);
		
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		MultipleStudents  ms = new MultipleStudents ();
		ms.getstudinfo(12, "Name");
		ms.getstudinfo("name@gmail.com", 854521450);
				
	}

}
