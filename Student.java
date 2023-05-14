package Assignments;

public class Student extends Department
{
	public void studentName()
	{ 
		System.out.println("Student ->Student Name"); 
	}
	
	public void studentDept() 
	{
		System.out.println("STudent ->STudent Department");
	}
	public void studentId()
	{
		System.out.println("STudent ->Student Id");
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		Student stud = new Student(); 
		stud.studentDept();
		stud.collegeCode();
		stud.collegeName();
		stud.collegeRank();
		stud.deptName();
		stud.studentDept();
		stud.studentId();
		stud.studentName();
		
		
	}

}
