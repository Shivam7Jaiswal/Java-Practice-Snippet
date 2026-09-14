 import java.util.Scanner;
 public class main {

	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter a string");
		String s=scan.nextLine();
		
		String y="";
		for (int i=0;i<s.length();i++) {
			
			if(s.charAt(i)>='A' && s.charAt(i)<='Z') {
				char ch=s.charAt(i);
				ch=(char)(ch+32);
				y=y+ch;
			}
			else if(s.charAt(i)>='a' && s.charAt(i)<='z') {
				char ch=s.charAt(i);
				ch=(char)(ch-32);
				y=y+ch;
			}
			else
				y=y+s.charAt(i);
		}
		
	

	System.out.println(y);
	}

}
