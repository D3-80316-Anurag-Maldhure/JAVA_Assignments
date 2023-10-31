package cricket.players;

import java.util.Scanner;

import java.util.Scanner;

public class Cricketer extends Player implements Batter, Bowler {

	private int runs;
	private int wickets;
	private int ballsFaced;
	private int oversDone;
	private int runsConceded;
	
	public Cricketer() {
		super();
		this.runs = 0;
		this.wickets = 0;
		this.ballsFaced= 0;
		this.oversDone = 0;
		this.runsConceded = 0;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public void setWickets(int wickets) {
		this.wickets = wickets;
	}
	
	public Cricketer(int id, String name, int age, int matchesPlayed, int runs, int wickets, int ballsFaced, int oversDone, int runsConceded) {
		super(id, name, age, matchesPlayed);
		this.runs = runs;
		this.wickets = wickets;
		this.ballsFaced = ballsFaced;
		this.oversDone = oversDone;
		this.runsConceded = runsConceded;
	}

	public int getBallsFaced() {
		return ballsFaced;
	}

	public void setBallsFaced(int ballsFaced) {
		this.ballsFaced = ballsFaced;
	}

	public int getOversDone() {
		return oversDone;
	}

	public void setOversDone(int oversDone) {
		this.oversDone = oversDone;
	}

	public int getRunsConceded() {
		return runsConceded;
	}

	public void setRunsConceded(int runsConceded) {
		this.runsConceded = runsConceded;
	}

	@Override
	public int getWickets() {
		return this.wickets;
	}

	@Override
	public double getEconomy() {
		return (double)this.runsConceded/this.oversDone;
	}

	@Override
	public int getRuns() {
		return this.runs;
	}

	@Override
	public double getAverage() {
		return this.runs/this.getMatchesPlayed();
	}

	@Override
	public double getStrikeRate() {
		return this.runs/this.ballsFaced*100;
	}
	
	public void accept() {
	Scanner sc = new Scanner(System.in);
	super.accept();
	int choice;
	System.out.println("Choose Player Type : ");
	System.out.println("1. Batter");
	System.out.println("2. Bowler");
	choice = sc.nextInt();
	if(choice == 1) {
		System.out.println("Enter Player Runs: ");
		this.runs = sc.nextInt();
		System.out.println("Enter Total Balls Faced: ");
		this.ballsFaced = sc.nextInt();
		}else if(choice == 2) {
		System.out.println("Enter Player Wickets: ");
		this.wickets = sc.nextInt();
		System.out.println("Enter Runs Conceded: ");
		this.runsConceded = sc.nextInt();
		System.out.println("Enter Total Overs Done: ");
		this.oversDone = sc.nextInt();
		}
		else {
			System.out.println("Enter A valid Choice!!!");
		}
	}
	
	@Override
	public String toString() {
		if(this.runs == 0) {
			return "Bowler Id: "+ this.getId()+", Name: "+ this.getName() + ", Age: "+this.getAge()+ ", Matches Played: "+this.getMatchesPlayed() + ", Wickets: "+ this.getWickets()+ ", Economy: "+this.getEconomy();
		}else {
		return "Batter Id: "+ this.getId()+", Name: "+ this.getName() + ", Age: "+this.getAge()+ ", Matches Played: "+this.getMatchesPlayed() + ", Runs: "+ this.getRuns()+ ", Average: " + this.getAverage()+ ", Strike Rate: "+ this.getStrikeRate();
		}
	}
}
