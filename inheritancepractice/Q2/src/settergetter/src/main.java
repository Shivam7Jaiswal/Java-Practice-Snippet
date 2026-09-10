package settergetter.src;

public class main{
	public static void main(String[] args){
		
		student s1=new student(12,"shivam",678);
		student s2=new student();
		student s3=new student();
	
		s3.setname("rajav");
		s3.setdistance(101);
		s3.setfrn(99);
		
		
		s2.display();
		s1.display();
		s3.display();
	}
}