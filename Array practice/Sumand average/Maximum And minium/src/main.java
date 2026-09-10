import java.util.Scanner;

class main {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the size of the Array:");
	int size=scan.nextInt();
	
	int[] arr=new int[size];

	System.out.println("Enter Number:");
	
	for(int i=0;i<size;i++) {
		arr[i]=scan.nextInt();
		
	}
	
	System.out.println("--------------Input Inserted--------------");
	System.out.println("Calculating Maximum And Minium value");
	System.out.println();
	
	int max=arr[0],min=arr[0];
	
	for (int i=0;i<size;i++) {
		
		if(max<arr[i]) {
			max=arr[i];
		}
		if(min>arr[i]) {
			min=arr[i];
		}
		
	}
	
	System.out.println("Max is "+max);
	System.out.println("Min is "+min);
	
	
	
	
	
	
	
	}

}
