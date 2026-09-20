import java.util.TreeMap;


class Employee  {
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
		

	
}
class Mykey implements Comparable<Mykey>{
	
	int key;
	
	public Mykey(int key) {
		this.key=key;
	}
	
	@Override
	public String toString() {
		
		return ("key"+this.key);
	}

	@Override
	public int compareTo(Mykey o) {
		
		return this.key-o.key;
	}
	
}

	
public class main {

	public static void main(String[] args) {
		TreeMap<Mykey,Employee> h=new TreeMap<Mykey,Employee>();
		
		h.put(new Mykey(1),new Employee(101,"shivam",12345));
		h.put(new Mykey(2),new Employee(102,"ram",345));
		h.put(new Mykey(3),new Employee(103,"raii",1345));
		h.put(new Mykey(4),new Employee(104,"om",543));
		
		System.out.println(h);


	}

}
