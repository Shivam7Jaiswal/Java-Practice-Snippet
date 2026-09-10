package q3.src;

public class placedstudent {
	
		int frn;
		double distancecovered;
		String studentname;
		String company;
		String designation;
		
	void setfrn(int d)
		{
		this.frn=d;
		}
	void setdistance(double m)
		{
		this.distancecovered=m;
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
	
	int getfrn()
	{
		return this.frn;
		
	}
	
	double getdistance()
	{
		return this.distancecovered;
	}
	
	String getname()
	{
		return this.studentname;
	}
	String getcname()
	{
		return this.company;
	}
	String getrole()
	{
		return this.designation;
	}
	
	public placedstudent()
		{
			this.frn=0;
			this.distancecovered=0;
			this.studentname="not given";
			this.company="not given";
			this.designation="not given";
		}
	
	public placedstudent(int a,double m,String b,String c,String d)
	{
		this.frn=a;
		this.distancecovered=m;
		this.studentname=b;
		this.company=c;
		this.designation=d;
		
	}
		void display()
		{
			System.out.println("FRN number is " + getfrn());
			System.out.println("distance travelled "+getdistance());
			System.out.println("student name is " + getname());
			System.out.println("Company name is " + getcname());
			System.out.println("Designation of the student is " + getrole());
			System.out.println();
		}
}
