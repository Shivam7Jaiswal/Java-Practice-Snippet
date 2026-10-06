import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=scan.nextLine();
		scan.close();
		
		String[] s=str.split(",");
		
		
		for(int i=0;i<s.length;i++) {
		
		if(s[i].contains("@")) {
		String str1=s[i].split("@")[0];
		String str2=s[i].split("@")[1];
		System.out.println("Domain:"+str2);
		System.out.println("Email id:"+str1);
		System.out.println();
	}
		
		else
		System.out.println("NO Domain is present at "+(i+1)+" Entry");
		
		}
	}
}