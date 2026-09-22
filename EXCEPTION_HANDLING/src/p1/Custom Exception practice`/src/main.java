class NotEligible extends Exception{
	
	public NotEligible(String message) {
		super(message);
	}
}

class voter {
	int vote;
	
	public voter(int vote) {
		this.vote=vote;
	}
	
	void validatevote() throws NotEligible{
		if(this.vote<18) {
			throw new NotEligible("You are not eligible");
		}
		else
			System.out.println("You are eligible");
	}
	
}

public class main {

	public static void main(String[] args) {
		voter v1=new voter(1);
		try {
		v1.validatevote();
		}
		catch(NotEligible e){
			System.out.println(e.getMessage());
			
		}
	}

}
