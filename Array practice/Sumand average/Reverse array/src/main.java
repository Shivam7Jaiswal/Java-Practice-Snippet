import java.util.Scanner;
class main {

	public static void main(String[] args) {
		int size;
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Size of array:");
		size=s.nextInt();
		
		int[] arr=new int[size];
		
		System.out.println("Enter Numbers:");
		
		for(int i=0;i<size;i++) {
			
			arr[i]=s.nextInt();
		}
		
		System.out.println("Reversing the Array");
		
		System.out.print("Given array:");
		for(int i=0;i<size;i++) {
			
		System.out.print(" "+arr[i]+" ");
		}
		System.out.println();
		System.out.print("Reversed array:");

		for (int i=size-1;i>=0;i--) {
			
			System.out.print(" "+arr[i]+" ");
			
		}
		

	}

}
