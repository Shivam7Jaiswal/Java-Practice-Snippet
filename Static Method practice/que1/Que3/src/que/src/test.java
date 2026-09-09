package que.src;
class libraryuser{
	
	String name;
	int ndays;
	static double fcharge=20;
	
	libraryuser(String a,int b)
	{
		this.name=a;
		this.ndays=b;
	}
	
	static void updatefine(double a)
	{
		libraryuser.fcharge=a;
	}
	
	double totalfine()
	{
		double a=this.ndays*libraryuser.fcharge;
		return a;
	}
	
	void display(double a)
	{
		System.out.println("Name: "+this.name+" Days over due:"+this.ndays);
		System.out.println("Fine charged:"+a);
		System.out.println();
	}
	
	
	
}

public class test {
public static void main(String[] args) {
	
	libraryuser l1=new libraryuser("shivam",10);
	libraryuser l2=new libraryuser("Om",20);
	
	libraryuser.updatefine(25);
	
	double tf1,tf2;
	
	tf1=l1.totalfine();
	tf2=l2.totalfine();
	
	l1.display(tf1);
	l2.display(tf2);
}
}
