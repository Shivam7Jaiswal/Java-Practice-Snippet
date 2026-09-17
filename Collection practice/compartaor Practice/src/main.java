import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;

import java.util.Scanner;


class Employee {
	int id;
	String name;
	double salary;
	
	Employee() {
		this.id = 0;
		this.name = "Not given";
		this.salary = 0.0;
	}
	
	Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	int getId() {
		return this.id;
	}

	void setId(int id) {
		this.id = id;
	}

	String getName() {
		return this.name;
	}

	void setName(String name) {
		this.name = name;
	}

	double getSalary() {
		return this.salary;
	}

	void setSalary(double salary) {
		this.salary = salary;
	}
	
	void display() {
		System.out.println("name="+this.name);
		System.out.println("id="+this.id);
		System.out.println("salary="+this.salary);
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]\n";
	}

	@Override
	public boolean equals(Object obj) {
		
		Employee e=(Employee)obj;
		
		if(this.id==e.id) {
			return true;
		}
		else
			return false;
	
	}

}
	

	class admin extends Employee	{
		
		double allowance;

		admin(int id, String name, double salary,double allowance) {
			super(id,name,salary);
			this.allowance = allowance;
		}

		double getAllowance() {
			return allowance;
		}

		void setAllowance(double allowance) {
			this.allowance = allowance;
		}
		
		void display() {
			
			super.display();
			System.out.println("Allowance="+this.allowance);
			System.out.println();
		}
		@Override
		public String toString() {
		    return "Admin [ID=" + getId() + 
		           ", Name=" + getName() + 
		           ", Salary=" + getSalary() + 
		           ", Allowance=" + allowance + "]";
		}
		
		
	}
	
	class salesmanager extends Employee{
		
		double incentive;
		int target;
		
		salesmanager(int id, String name, double salary,int target,double incentive){
			
			super(id,name,salary);
			this.target=target;
			this.incentive=incentive;
		}
		
		
		double getIncentive() {
			return this.incentive;
		}


		void setIncentive(double incentive) {
			this.incentive = incentive;
		}


		int getTarget() {
			return this.target;
		}


		void setTarget(int target) {
			this.target = target;
		}


		void display() {
			
			super.display();
			System.out.println("Target="+this.target);
			System.out.println("Incentive="+this.incentive);
			System.out.println();
		}
		@Override
		public String toString() {
		    return "SalesManager [ID=" + getId() + 
		           ", Name=" + getName() + 
		           ", Salary=" + getSalary() + 
		           ", Target=" + target + 
		           ", Incentive=" + incentive + "]";
		}

	}
	
	class HR extends Employee{
		
		double comission;
		
		HR(int id,String name,double salary,double comission){
			super(id,name,salary);
			this.comission=comission;
		}

		double getComission() {
			return this.comission;
		}

		void setComission(double comission) {
			this.comission = comission;
		}
		
		void display() {
			super.display();
			System.out.println("Comission="+this.comission);
			System.out.println();
		}
		@Override
		public String toString() {
		    return "HR [ID=" + getId() + 
		           ", Name=" + getName() + 
		           ", Salary=" + getSalary() + 
		           ", Commission=" + comission + "]";
		}

	}

public class main {

	public static void main(String[] args) {
		ArrayList<Employee> a=new ArrayList<Employee>();
		a.add(new Employee(101,"shivam",123));
		a.add(new Employee(103,"Ram",4321));
		a.add(new Employee(101,"om",12323));
		a.add(new Employee(105,"shu",2345));
		
		Scanner scan=new Scanner(System.in);
	
	
		
		System.out.println("1 TO sort by id");
		System.out.println("2 TO sort by name");
		System.out.println("3 TO sort by salary");
		int choice=scan.nextInt();
		if(choice ==1) {
		IDComparator c=new IDComparator();
		Collections.sort(a,c);
		System.out.println("Sorting BY ID");
		System.out.println(a);}
		else if(choice==2) {
		NameComparator nc=new NameComparator();
		System.out.println("Sorting BY Name");
		Collections.sort(a,nc);
		System.out.println(a);
		}
		else if(choice==3) {
			salaryComparator sc=new salaryComparator();
			System.out.println("Sorting BY salary");
			Collections.sort(a,sc);
			System.out.println(a);}
			
		
		
		
		
		System.out.println(a.get(1).equals(a.get(0)));
	}
	
	}



