package cricket.players;

public class Players{


	public static int batterTotalRuns(Player[] team) {
		int runs = 0;
		for(Player p:team) {
			Cricketer b = (Cricketer)p;
			runs = runs + b.getRuns();
		}
		return runs;
	}

	public static int bowlerTotalWickets(Player[] team) {
		int wickets = 0;
		for(Player p:team) {
			Cricketer b = (Cricketer)p;
			wickets = wickets + b.getWickets();
		}
		return wickets;
	}
	
	public static int countBatters(Player[] team) {
		int count = 0;
		for(Player p:team) {
			Cricketer b = (Cricketer)p;
			if(b.getWickets() == 0) {
				count++;
			}
		}
		return count;
	}
	
	public static int countBowlers(Player[] team) {
		int count = 0;
		for(Player p:team) {
			Cricketer b = (Cricketer)p;
			if(b.getRuns() == 0) {
				count++;
			}
		}
		return count;
	}
	
	public static Player maxRunBatter(Player[] team) {
		int max = 0;
		int index = 0;
		for(int i = 0; i<team.length; i++) {
			Cricketer b = (Cricketer)team[i];
			if(b.getRuns() > max) {
				max = b.getRuns();
				index = i;
			}
		}
		return team[index];
	}
	
	public static Player maxWicketBowler(Player[] team) {
		int max = 0;
		int index = 0;
		for(int i = 0; i<team.length; i++) {
			Cricketer b = (Cricketer)team[i];
			if(b.getWickets() > max) {
				max = b.getWickets();
				index = i;
			}
		}
		return team[index];
	}
}
