package comm.src;

import java.util.Scanner;

class main {

	public static void main(String[] args) {
		
		String A;
		String rev="";
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter a string:");
		A=scan.nextLine();
		
		if (A.isEmpty()) {
			System.out.println("The string is empty");
			return;
		}
		
		scan.close();
		
		
		
		for(int i=A.length()-1;i>=0;i--) {
			rev=rev+A.charAt(i);
		
		}
		
		System.out.println("The Reversed String is "+rev);
		

			
			if (rev.equals(A))
			{
				
				System.out.println("The String IS palindrome");
				
			}
		
			else
		
			{
			System.out.println("The string is not Palindrome");
			}
		
	}
	
	
}
