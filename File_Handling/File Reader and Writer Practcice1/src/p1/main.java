package p1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



public class main {

	public static void main(String[] args) {
		FileReader fr1 = null;
		FileReader fr2=null;
		BufferedReader br1=null;
		BufferedReader br2=null;
		try {
			 fr1=new FileReader("firstName.txt");
			 fr2=new FileReader("lastName.txt");
			 br1=new BufferedReader(fr1);
			 br2=new BufferedReader(fr2);
			String str1,str2;
			while((str1=br1.readLine()) !=null && (str2=br2.readLine()) !=null) {
			System.out.println(str1+" "+str2);
			}
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fr1.close();
				fr2.close();
				br1.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			}
		
		
	}
	}
