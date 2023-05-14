package Assignments;

public class Automation extends MultipleLang implements TestTool, Language
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Automation at = new Automation(); 
		at.python();
		at.java();
		at.selenium();
		
	}

	@Override
	public void java() 
	{
		// TODO Auto-generated method stub
		System.out.println("Calling Java method ");
	}

	@Override
	public void selenium() 
	{
		// TODO Auto-generated method stub
		System.out.println("Calling selenium method");
	}

	
}
