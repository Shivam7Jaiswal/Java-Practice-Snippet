package settergetter.src;

public class student {
	
	int frn;
	String studentname;
	double distancecovered;
	
	public student() {
		this.frn=0;
		this.studentname="Not Given";
		this.distancecovered=0;
	}
	public student(int frn,String name,double distance) {
		this.frn=frn;
		this.studentname=name;
		this.distancecovered=distance;

		
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
			
			System.out.println("FRN is "+getfrn());
			System.out.println("Name is "+getname());
			System.out.println("Distance travelled is "+getdistance());
			System.out.println();
		}
		
	
}


