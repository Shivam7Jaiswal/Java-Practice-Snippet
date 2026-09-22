package p1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
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
	

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]\n";
	}
	

}
	


 class main1 {
 
	public static void main1(String[] args) {
		
		try {
			FileOutputStream fos=new FileOutputStream("demo.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(new Employee(10,"shivam",2345));
			System.out.println("Object succesfully Added");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}


public class main {
	 
	public static void main(String[] args) {
		
		try {
			FileInputStream fos=new FileInputStream("demo.txt");
			ObjectInputStream oos=new ObjectInputStream(fos);
			Employee e=(Employee)oos.readObject();
			System.out.println(e);
			
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {		
			e.printStackTrace();
		}
	
	}
	}


