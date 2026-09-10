package q3.src;

public class main {
	public static void main(String args[])
	{
		placedstudent p1=new placedstudent();
		placedstudent p2=new placedstudent(123,100,"shivam","amazon","developer");
		placedstudent p3=new placedstudent();
		p3.setstudentname("raju");
		p3.setfrn(99);
		p3.setdistance(12);
		p3.setcompany("Wipro");
		p3.setdesignation("HR");
		p1.display();
		p2.display();
		p3.display();
	}

}
