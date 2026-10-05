package p1;

import java.io.FileWriter;
import java.io.IOException;

class main1 {

	public static void main(String[] args) {
	
		
		try {
			
			FileWriter fw=new FileWriter("demo.txt",true);
			fw.write("What are you doing");
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}