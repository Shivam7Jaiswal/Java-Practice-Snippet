package q3.src;

public class placedstudent {
	
		int frn,distancecovered;
		String studentname;
		String company;
		String designation;
		
	void setfrn(int d)
		{
		this.frn=d;
		}
		
	void setstudentname(String m)
		{
		this.studentname=m;
		}
	void setcompany(String r)
		{
		this.company=r;
		}
	void setdesignation(String a)
		{
		this.designation=a;
		}
		
	public placedstudent()
		{
			this.frn=0;
			this.studentname="not given";
			this.company="not given";
			this.designation="not given";
		}
	
	public placedstudent(int a,String b,String c,String d)
	{
		this.frn=a;
		this.studentname=b;
		this.company=c;
		this.designation=d;
		
	}
		void display()
		{
			System.out.println("FRN number is " + this.frn);
			System.out.println("student name is " + this.studentname);
			System.out.println("Company name is " + this.company);
			System.out.println("Designation of the student is " + this.designation);
			System.out.println();
		}
}
