import java.util.Scanner;
class main {

	public static void main(String[] args) {
		String org;
		String rDup="";
		char ch1;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter a String:");
		org=scan.nextLine();
		
		for(int i=0;i<org.length();i++) {
			char ch=org.charAt(i);
			boolean notpresent=true;
			
			for(int j=0;j<rDup.length();j++) {
				ch1=rDup.charAt(j);
				if (ch1==ch) {
					notpresent=false;
					break;
					}	
	
			}
			if(notpresent) {
				rDup=rDup+ch;
				}
		
		}
		
		System.out.println("The string after removing duplicate");
		System.out.println(rDup);
		
	}//main ends

}
