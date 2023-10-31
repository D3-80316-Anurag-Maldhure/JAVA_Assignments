package cricket.players;

import java.util.Scanner;

public abstract class Player {

	private int id;
	private String name;
	private int age;
	private int matchesPlayed;
	
	public Player() {
		super();
	}

	public Player(int id, String name, int age, int matchesPlayed) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.matchesPlayed = matchesPlayed;
	}
	
	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Player Id: ");
		this.id = sc.nextInt();
		System.out.println("Enter The Player Name: ");
		this.name = sc.next();
		System.out.println("Enter The Player Age: ");
		this.age = sc.nextInt();
		System.out.println("Enter The Player Matches Played: ");
		this.matchesPlayed = sc.nextInt();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getMatchesPlayed() {
		return matchesPlayed;
	}

	public void setMatchesPlayed(int matchesPlayed) {
		this.matchesPlayed = matchesPlayed;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
}
