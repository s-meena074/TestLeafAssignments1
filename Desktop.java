package Assignments;

public class Desktop extends Computer
{

	public void desktopSize() {
		System.out.println("desktopSize from the class Desktop");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Desktop desk=new Desktop();
		desk.desktopSize();
		Computer model = new Computer(); 
		model.computermodel();

	}

}
