package que1;



class Employee{
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
	
	void calsalary() {
		this.salary=this.salary;
	}
}
	

	class admin extends Employee{
		
		double allowance;
		double totalSalary;

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
			System.out.println("Total salary:"+this.totalSalary);
			System.out.println();
		}
		
		void calsalary(){
			
			this.totalSalary =this.salary+this.allowance;
		}
		
	}
	
	class salesmanager extends Employee{
		
		double incentive;
		int target;
		double totalSalary;
		
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
		void calsalary(){
			
			this.totalSalary =this.salary+this.incentive;
		}

		void display() {
			
			super.display();
			System.out.println("Target="+this.target);
			System.out.println("Incentive="+this.incentive);
			System.out.println("Total salary:"+this.totalSalary);
			System.out.println();
		}
	}
	
	class HR extends Employee{
		
		double comission;
		double totalSalary;
		
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
		void calsalary(){
			
			this.totalSalary =this.salary+this.comission;
		}
		void display() {
			super.display();
			System.out.println("Comission="+this.comission);
			System.out.println("Total salary:"+this.totalSalary);
			System.out.println();
		}
	}
	
	
	
	

class main {
	public static void main(String[] args) {
		
		Employee e1=new Employee(101,"shivam",1234);
		admin e2=new admin(102,"Ram",876,1000);
		salesmanager e3=new salesmanager(103,"Shivani",999,10,500);
		HR e4=new HR(104,"lokesh",666,1000);
		
		e2.calsalary();
		e3.calsalary();
		e4.calsalary();
		
		e1.display();
		System.out.println();
		e2.display();
		e3.display();
		e4.display();
		}
}
