package reverce.fun;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a String");
		StringBuilder str=new StringBuilder(scan.nextLine());
		
		
		str=str.reverse();
		
		System.out.println(str);
	}

}