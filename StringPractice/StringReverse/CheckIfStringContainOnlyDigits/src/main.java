import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		String str;
		boolean a=true;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter a String:");
		str=scan.nextLine();
		for (int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>='0' && ch<='9') {
				 a=true;
			}
			else
			{
				a=false;
				break;
			}
		}
		
		if(a==false) {
			System.out.println("The String also contain character");
		}

		if(a==true) {
			System.out.println("String contain only digit");
		}
	}

}
