package inheritancepractice.src;

public class main {
	public static void main(String args[])
	{
		placedstudent p1=new placedstudent(123,"shivam",788,"amazon","developer");
		student s1=new student(101,"om",4567);
		p1.display();
		s1.display();
		System.out.println("All student count is "+s1.getcount());
		
	}

}
