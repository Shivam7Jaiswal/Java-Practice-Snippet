package p2;
import p1.Employee;


public class admin extends Employee{
	
	private double allowance;

	public admin(int id, String name, double salary,double allowance) {
		super(id,name,salary);
		this.allowance = allowance;
	}

	public double getAllowance() {
		return allowance;
	}

	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}
	
	public void display() {
		
		super.display();
		System.out.println("Allowance="+this.getAllowance());
		System.out.println();
	}
}
