import java.util.Scanner;
class main {

	public static void main(String[] args) {
		int[] arr;
		arr=new int[5];
		int sum=0;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number:");
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
		
	
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
			
		}
		
		
	System.out.println("Entered number are ");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("["+arr[i]+"]");
		}
		
		
		System.out.println();
		System.out.println("Sum is "+sum);
		System.out.println();
		System.out.println("And therir average is"+sum/arr.length);
		
	}

}
