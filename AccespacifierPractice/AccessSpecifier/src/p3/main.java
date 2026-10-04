package p3;
import p1.Employee;
import p2.*;
import p2.work;



public class main {
	public static void main(String[] args) {
		work a=new salesmanager(104,"Shivani",999,10,500);
		Employee e1=new Employee(101,"shivam",1234);
		Employee e2=new admin(102,"Ram",876,1000);
		Employee e3=new salesmanager(103,"Shivani",999,10,500);
		Employee e4=new HR(104,"lokesh",666,1000);
		e1.display();
		System.out.println();
		e2.display();
		e3.display();
		e4.display();
		
	    a.whatwork();
	}
}