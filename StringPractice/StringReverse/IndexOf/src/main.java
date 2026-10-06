import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a String");
		
		String str=scan.nextLine();
		
		int a=str.indexOf("/");
		int b=str.indexOf("https");
		System.out.println(a+" "+b);

	}

}
