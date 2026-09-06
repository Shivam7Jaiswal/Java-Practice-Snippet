package inheritancepractice.src;

public class placedstudent extends student{
	
		String company;
		String designation;
		

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
			super();
			this.company="not given";
			this.designation="not given";
		}
	
	public placedstudent(int a,String b,double m,String c,String d)
	{
		super(a,b,m);
		this.company=c;
		this.designation=d;
	
	}
		void display()
		{
			super.display();
			System.out.println("Company name is " + this.company);
			System.out.println("Designation of the student is " + this.designation);
			System.out.println();
		}
		
}
