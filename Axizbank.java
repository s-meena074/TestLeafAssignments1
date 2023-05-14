package Assignments;

public class Axizbank implements BankInfo
{

	public void deposit() 
	{
		System.out.println("deposit from Axis class");
	}
	
	public static void main(String[] args) 
	{
		Axizbank axiz = new Axizbank(); 
		axiz.saving();
		axiz.deposits();
		axiz.deposit();
		axiz.fixed();
	}

	@Override
	public void saving() 
	{
		// TODO Auto-generated method stub
		System.out.println("Customer can avail upto7% interest in savings account");
	}

	@Override
	public void fixed() {
		// TODO Auto-generated method stub
		System.out.println("Customer can avail upto 4% interest in Fixed Deposit");
	}

	@Override
	public void deposits() {
		// TODO Auto-generated method stub
		System.out.println("Customer can avail upto 8% Direct Deposit");
	}

}
