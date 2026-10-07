import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=scan.nextLine();
		
		String st[]=str.split(",");
		
		for(int i=0;i<st.length;i++) {
			
			System.out.println(st);
			
		}
		System.out.println(str);
		
	}

}
