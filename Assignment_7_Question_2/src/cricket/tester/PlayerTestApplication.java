package cricket.tester;

import cricket.players.*;

public class PlayerTestApplication {

	public static void main(String[] args) {
		
		Player[] team = new Player[3];
		for(int i=0; i<team.length; i++) {
		team[i] = new Cricketer();
		team[i].accept();
		}
		
		for(Player p:team) {
			System.out.println(p.toString());
		}
		int totalRuns = Players.batterTotalRuns(team);
		System.out.println("Total runs of all Batters: " + totalRuns);
		
		int totalWickets = Players.bowlerTotalWickets(team);
		System.out.println("Total wickets of all Bowlers: " + totalWickets);
		
		int batterCount = Players.countBatters(team);
		System.out.println("Total Count of all Batters: " + batterCount);
		
		int bowlerCount = Players.countBowlers(team);
		System.out.println("Total Count of all Bowlers: " + bowlerCount);
		
		Player maxRuns = Players.maxRunBatter(team);
		System.out.println("Batter with Maximum Runs: " + maxRuns);
		
		Player maxWickets = Players.maxWicketBowler(team);
		System.out.println("Bowler with Maximum Wickets: " + maxWickets);
	}
}
