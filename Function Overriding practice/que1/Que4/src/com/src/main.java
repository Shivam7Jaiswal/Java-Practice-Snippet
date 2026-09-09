package com.src;


class player{ 
	
	String name;
	int age;
	String country;
	int matchPlayed;
	int jerseyNumber;
	String getName() {
		return this.name;
	}
	void setName(String name) {
		this.name = name;
	}
	int getAge() {
		return this.age;
	}
	void setAge(int age) {
		this.age = age;
	}
	String getCountry() {
		return this.country;
	}
	void setCountry(String country) {
		this.country = country;
	}
	int getMatchPlayed() {
		return this.matchPlayed;
	}
	void setMatchPlayed(int matchPlayed) {
		this.matchPlayed = matchPlayed;
	}
	int getJerseyNumber() {
		return this.jerseyNumber;
	}
	void setJerseyNumber(int jerseyNumber) {
		this.jerseyNumber = jerseyNumber;
	}
	
	
	player(String name, int age, String country, int matchPlayed, int jerseyNumber) {
		this.name = name;
		this.age = age;
		this.country = country;
		this.matchPlayed = matchPlayed;
		this.jerseyNumber = jerseyNumber;
	}
	
	void display() {
		System.out.println("Name:"+this.getName());
		System.out.println("Age:"+this.getAge());
		System.out.println("Country"+this.getCountry());
		System.out.println("Matches Played:"+this.getMatchPlayed());
		System.out.println("Jersey Number:"+this.getJerseyNumber());
		
	}
	
	void play() {
		System.out.println("Players are playing");
		System.out.println();
	}
	
}

class cricketplayer extends player{

	int totalRuns;
	int totalWickets;
	String battingStyle;
	String bowlingStyle;
	
	
	cricketplayer(String name, int age, String country, int matchPlayed, int jerseyNumber, int totalRuns,
			int totalWickets, String battingStyle, String bowlingStyle) {
		super(name, age, country, matchPlayed, jerseyNumber);
		this.totalRuns = totalRuns;
		this.totalWickets = totalWickets;
		this.battingStyle = battingStyle;
		this.bowlingStyle = bowlingStyle;
	}


	int getTotalRuns() {
		return this.totalRuns;
	}


	void setTotalRuns(int totalRuns) {
		this.totalRuns = totalRuns;
	}


	int getTotalWickets() {
		return this.totalWickets;
	}


	void setTotalWickets(int totalWickets) {
		this.totalWickets = totalWickets;
	}


	String getBattingStyle() {
		return this.battingStyle;
	}


	void setBattingStyle(String battingStyle) {
		this.battingStyle = battingStyle;
	}


	String getBowlingStyle() {
		return this.bowlingStyle;
	}


	void setBowlingStyle(String bowlingStyle) {
		this.bowlingStyle = bowlingStyle;
	}
	
	
	void play() {
		System.out.println("Cricket Players are playing with Bat and bowl");
		System.out.println();
	}
	
	

void display() {
	super.display();

	System.out.println("Total runs:"+this.getTotalRuns());
	System.out.println("Total wicket:"+this.getTotalWickets());
	System.out.println("Batting Style:"+this.getBattingStyle());
	System.out.println("Bowling Style:"+this.getBowlingStyle());
	System.out.println();
}	

}
	class footballPlayer extends player{
		
		int totalGoals;
		String playingPosition;
		int getTotalGoals() {
			return this.totalGoals;
		}
		void setTotalGoals(int totalGoals) {
			this.totalGoals = totalGoals;
		}
		String getPlayingPosition() {
			return this.playingPosition;
		}
		void setPlayingPosition(String playingPosition) {
			this.playingPosition = playingPosition;
		}
		
		
		
		footballPlayer(String name, int age, String country, int matchPlayed, int jerseyNumber, int totalGoals,
				String playingPosition) {
			super(name, age, country, matchPlayed, jerseyNumber);
			this.totalGoals = totalGoals;
			this.playingPosition = playingPosition;
		}
		
		void display()
		{
			super.display();
			System.out.println("total Goals:"+this.getTotalGoals());
			System.out.println("Playing Position:"+this.getPlayingPosition());
			System.out.println();
			
		}		
		
		
		void play() {
			System.out.println("Football Players are playing with with football and scoring goals");
			System.out.println();
		}
		
		
	}
	




class main {

	public static void main(String[] args) {
		cricketplayer p1=new cricketplayer("shivam",24,"India",51,7,1001,55,"right-hand-batsman","fast bowler");
		footballPlayer p2=new footballPlayer("Ram",18,"Canada",99,67,89,"goalkeeper");
		player p3=new player("OM",20,"africa",81,99);
		p1.display();
		p1.play();
		p2.display();
		p2.play();
		p3.display();
		p3.play();

	}

}
