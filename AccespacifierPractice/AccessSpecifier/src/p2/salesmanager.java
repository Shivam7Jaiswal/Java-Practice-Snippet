package p2;
import p1.Employee;
public class salesmanager extends Employee implements work{
	
	private double incentive;
	private int target;
	
	public salesmanager(int id, String name, double salary,int target,double incentive){
		
		super(id,name,salary);
		this.target=target;
		this.incentive=incentive;
	}
	
	
	public double getIncentive() {
		return this.incentive;
	}


	public void setIncentive(double incentive) {
		this.incentive = incentive;
	}


	public int getTarget() {
		return this.target;
	}


	public void setTarget(int target) {
		this.target = target;
	}
	
	public void whatwork() {

			System.out.println("It is Salesmanager");
	
	}


public	void display() {
		
		super.display();
		System.out.println("Target="+this.getTarget());
		System.out.println("Incentive="+this.getIncentive());
		System.out.println();
	}
}
