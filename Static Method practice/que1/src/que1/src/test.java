package que1.src;

class electricitybill{
	static double erate=5;
	String name;
	int unitused;
	
	static void setelectricityrate(double a)
	{
		electricitybill.erate=a;
	}
	
	void setelectricitybill(String a,int b){
		this.name=a;
		this.unitused=b;
	}
	
	double calculatebill() {
		double amount;
		amount=this.unitused*electricitybill.erate;
		return amount;
	}
	
	void display(double a) {
		System.out.println("NAME: "+this.name+" Unit Consumed: "+this.unitused);
		System.out.println("The Bill Generated:"+a);
		System.out.println();
	}
	
	
	
}

public class test {

	public static void main(String[] args) 
	{
		
		electricitybill e1= new electricitybill();
	
		electricitybill e2= new electricitybill();
		
		e1.setelectricitybill("shivam",11);
		e2.setelectricitybill("ram",81);
		
	electricitybill.setelectricityrate(11); // Electricity rate is set
	
		double a,b;
		
		a=e1.calculatebill();
		b=e2.calculatebill();
		System.out.println("THE ELECTRICITY RATE PER UNIT IS: "+electricitybill.erate);
		e1.display(a);
		e2.display(b);

	}
}