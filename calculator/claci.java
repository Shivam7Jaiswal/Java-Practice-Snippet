class calculator{
	void add(int a,int b)
	{
		System.out.println("The Addition of a and b is "+ a+b);
	}
	void add(double a,int b)
	{
		System.out.println("The Addition of a and b is "+ a+b);	
	}
	void add(int a,double b)
	{
		System.out.println("The Addition of a and b is "+ a+b);
	}
	void add(double a,double b)
	{
		System.out.println("The Addition of a and b is "+ a+b);
	}



	void multiply(int a,int b)
	{
		System.out.println("The multipliaction of a and b is "+ a*b);
	}
	void multiply(double a,int b)
	{
		System.out.println("The multipliaction of a and b is "+ a*b);
	}
	void multiply(int a,double b)
	{
		System.out.println("The multipliaction of a and b is "+ a*b);
	}
	void multiply(double a,double b)
	{
		System.out.println("The multipliaction of a and b is "+ a*b);
	}



	void substract(int a,int b)
	{
		System.out.println("The subtraction of a and b is "+ (a-b));
	}
	void substract(double a,int b)
	{
		System.out.println("The subtraction of a and b is "+ (a-b));
	}

	void substract(int a,double b)
	{
		System.out.println("The subtraction of a and b is "+ (a-b));
	}

	void substract(double a,double b)
	{
		System.out.println("The subtraction of a and b is "+ (a-b));
	}


}

class test{

public static void main(String[] Args)
{
	calculator c1=new calculator();
	
	c1.add(3,6.5);
	c1.add(4.35,4.4);
	c1.add(3,5);
	c1.multiply(23,2);
	c1.multiply(23,2.33);
	c1.substract(23,235);
	c1.substract(2,32);
}

}