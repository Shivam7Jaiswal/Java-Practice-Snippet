package subString;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a String");
		
		String str=scan.nextLine();
		int a=str.indexOf("https");
		int b=str.indexOf("/");
	
		if(a!=-1 && b!=-1)
			System.out.println(str.substring(a,b));
		else
			System.out.println("Not found");
}
}
