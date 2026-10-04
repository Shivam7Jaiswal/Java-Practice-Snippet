package p1;

public class Employee {
	
	
		private int id;
		private String name;
		private double salary;
		
	public	Employee() {
			this.id = 0;
			this.name = "Not given";
			this.salary = 0.0;
		}
		
	public	Employee(int id, String name, double salary) {
			this.id = id;
			this.name = name;
			this.salary = salary;
		}

	public	int getId() {
			return this.id;
		}

		public void setId(int id) {
			this.id = id;
		}

	public	String getName() {
			return this.name;
		}

	public	void setName(String name) {
			this.name = name;
		}

		public double getSalary() {
			return this.salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}
		
	public	void display() {
			System.out.println("name="+this.getName());
			System.out.println("id="+this.getId());
			System.out.println("salary="+this.getSalary());
		}
	}
		


