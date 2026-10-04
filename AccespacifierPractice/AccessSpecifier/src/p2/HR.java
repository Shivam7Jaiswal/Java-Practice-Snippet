package p2;
import p1.Employee;



	public class HR extends Employee{
		
	private	double comission;
		
	public HR(int id,String name,double salary,double comission){
			super(id,name,salary);
			this.comission=comission;
		}

	public	double getComission() {
			return this.comission;
		}

		public void setComission(double comission) {
			this.comission = comission;
		}
		
	public	void display() {
			super.display();
			System.out.println("Comission="+this.getComission());
			System.out.println();
		}
	}
	

