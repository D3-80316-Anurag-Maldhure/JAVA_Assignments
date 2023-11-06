package com.candidate;


//POJO class
public class PartyVotes {
	
	private String party;
	private int votes;
	
	public PartyVotes() {
		
	}
	
	public PartyVotes(String party, int votes) {
		this.party = party;
		this.votes = votes;
	}

	public String getParty() {
		return party;
	}

	public void setParty(String party) {
		this.party = party;
	}

	public int getVotes() {
		return votes;
	}

	public void setVotes(int votes) {
		this.votes = votes;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PartyVotes [party=").append(party).append(", votes=").append(votes).append("]");
		return builder.toString();
	}
	
}
