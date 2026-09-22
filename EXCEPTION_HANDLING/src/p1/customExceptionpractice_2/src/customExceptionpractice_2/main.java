package customExceptionpractice_2;

import java.util.ArrayList;

class login{
	String log;
	String pw;
	
	public login (String l) {
		this.log=l;
	}
	
	public void validate() throws invalidlogin {
		if(!this.log.contains("@")) {
			throw new invalidlogin("LOGIN IS WRONG");
		
		}
		System.out.println("login is correct");
	}
	
	
}

class invalidlogin extends Exception{
	
	public invalidlogin(String message) {
		super(message);
	}
	
}

public class main {

	public static void main(String[] args) {
		
		ArrayList<login> l=new ArrayList<login>();
		
		l.add(new login("ahivam"));
		
		try {
			l.get(0).validate();
		} catch (invalidlogin e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
