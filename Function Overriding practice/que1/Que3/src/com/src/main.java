package com.src;

class shape{
	double area=1;

	double getArea() {
		return this.area;
	}

	void setArea(double area) {
		this.area = area;
	}
	
	void calarea(){
		area=this.area;
	}
}

class triangle extends shape{
	double base;
	double height;
	
	triangle(double base,double height){
		this.base=base;
		this.height=height;
	}
		
	double getBase() {
		return this.base;
	}
	void setBase(double base) {
		this.base = base;
	}
	double getHeight() {
		return this.height;
	}
	void setHeight(double height) {
		this.height = height;
	}
	
	
	void calarea()
	{
		this.area=this.getBase()*this.getHeight();
	}
}
	
	class rectangle extends shape{
		
		double length;
		double breadth;
	
		rectangle(double lenght,double breadth){
			this.length=length;
			this.breadth=breadth;
			
		}

		double getLength() {
			return this.length;
		}

		void setLength(double length) {
			this.length = length;
		}

		double getBreadth() {
			return this.breadth;
		}

		void setBreadth(double breadth) {
			this.breadth = breadth;
		}
		
		void calarea()
		{
			this.area=2+(this.getLength()+this.getBreadth());
		}
		
	}
	
	class circle extends shape{
		
		double radius;
		
		circle(double radius)
		{
			this.radius=radius;
		}
		
		double getRadius(){
			return this.radius;
		}
		
		void setRadius(double radius) {
			this.radius=radius;
		}
		
		void calarea()
		{
			this.area=3.14*this.radius*this.radius;
		}
	}
	

class main {

	public static void main(String[] args) {
		circle s1=new circle (10);
		rectangle s2=new rectangle(10,10);
		triangle s3=new triangle(5,5);
		shape s4=new shape();
		s1.calarea();
		s2.calarea();
		s3.calarea();
		s4.calarea();
		
		System.out.println(s4.getArea());
		System.out.println("area of circle:"+s1.getArea());
		System.out.println();
		System.out.println("area of rectangle:"+s2.getArea());
		System.out.println();
		System.out.println("area of triangle:"+s3.getArea());
	}

}

