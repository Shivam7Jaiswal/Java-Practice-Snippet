package que2.src;
class employee
{
	String ename;
	double bsalary;
	static double bonus=10;
	
	employee(String a,double b){
		this.ename=a;
		this.bsalary=b;
	}
	static void updatebonus(double a) {
		employee.bonus=a;
	}
	
	double tsalary()
	{
		double a=this.bsalary+(this.bsalary*employee.bonus/100);
		return a;
	}
	
	void display(double a)
	{
		System.out.println("Name:"+this.ename+"  Basic salary: "+this.bsalary);
		System.out.println("The total Salary after adding bonus is:"+a);
		System.out.println();
	}
}
public class test {

	public static void main(String[] args) {
		employee e1=new employee("Shivam",12000);
		employee e2=new employee("ram",1000);
		
		employee.updatebonus(20);
		
		double tsalary1,tsalary2;
		tsalary1=e1.tsalary();
		tsalary2=e2.tsalary();
		
		e1.display(tsalary1);
		e2.display(tsalary2);
	
	}

}
