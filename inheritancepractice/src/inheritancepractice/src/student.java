package inheritancepractice.src;


public class student {
	
	int frn;
	String studentname;
	double distancecovered;
	public static int count=0;
	
	public student() {
		this.frn=0;
		this.studentname="Not Given";
		this.distancecovered=0;
	}
	public student(int frn,String name,double distance) {
		this.frn=frn;
		this.studentname=name;
		this.distancecovered=distance;
		count++;
		
	}
	
	void setfrn(int a){
		this.frn=a;
	}
	
	void setname(String a){
		this.studentname=a;
	}
	
	void setdistance(double a){
		this.distancecovered=a;
	}
	
	int getfrn(){
		return this.frn;
	}
		
		String getname(){
			return this.studentname;
		}
			double getdistance(){
				return this.distancecovered;
			}
	
		void display(){
			
			System.out.println("FRN number is " + this.frn);
			System.out.println("Distance covered by student is " + this.distancecovered);
			System.out.println("student name is " + this.studentname);
//			System.out.println(student.count);
	
		}
		int getcount()
		{
			return student.count;
		}
		
	
}
