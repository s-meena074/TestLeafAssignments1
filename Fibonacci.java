package week1.day2;

public class Fibonacci {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a = 0, b=1,c, i; 
		int count = 56; 
		
		System.out.print(+a);
		System.out.print(" "+b);
		
		for (i=2;i<count;i++)
		{ 
			c= a+b; 
			System.out.println(" " +c);
			a = b; 
			b = c; 
		}

	}

}
