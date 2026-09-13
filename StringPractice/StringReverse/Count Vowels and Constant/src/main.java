import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a String:");
		String str=scan.nextLine();
		str=str.toLowerCase();
		scan.close();
		int count=0,vcount=0;
		int a=0,e=0,z=0,o=0,u=0;
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			
			
			if(ch>='a' && ch<='z') 
			{
				if(ch=='a') {
					a++;
					count++;
				}
				else if(ch=='e') {
					e++;
					count++;
				}
				else if(ch=='i') {
					z++;
					count++;
				}
				else if(ch=='o') {
					o++;
					count++;
				}
				else if(ch=='u') {
					u++;
					count++;
				}
				else 
					vcount++;
			}
			
			
		
			
		}
		
		System.out.println("The given String is "+str);
		System.out.println("Vowels a="+a+" e="+e+" i="+z+" o="+o+" u="+u);
		System.out.println("Total vowel:"+count);
		System.out.println("Total constant:"+vcount);
		
	}

}
