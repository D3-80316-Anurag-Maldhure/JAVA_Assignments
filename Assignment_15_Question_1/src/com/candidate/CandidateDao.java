package com.candidate;

import java.security.KeyStore.TrustedCertificateEntry;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.QueryReturnType;

public class CandidateDao implements AutoCloseable{
	private Connection connection;

	public CandidateDao() throws SQLException {
		this.connection = DBUtil.getConnection();
	}
	
	public void close() {
		try {
			if (connection != null)
				connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//Assignment TODO
	List<PartyVotes> getPartywiseVotes() throws SQLException {
		List<PartyVotes> partyVotesList = new ArrayList<>();
		String getPartywiseVotesQuery = "SELECT party, sum(votes) as \"Total Votes\" FROM candidates GROUP BY party";
		
		try(PreparedStatement statement = connection.prepareStatement(getPartywiseVotesQuery)){
			
			try(ResultSet rSet = statement.executeQuery()) {
				while(rSet.next()) {
					String party 	= rSet.getString("party");
					int votes 		= rSet.getInt("Total votes");
					PartyVotes pVotes = new PartyVotes(party, votes);
					partyVotesList.add(pVotes);
				}	
			}//rSet.close();
		}//statement.close()
		return partyVotesList;
	}
	
	public int save(Candidate c) throws SQLException{
		String saveQuery = "INSERT INTO candidates VALUES(default,?,?,?)";
		try(PreparedStatement statement = connection.prepareStatement(saveQuery)){
			statement.setString(1, c.getName());
			statement.setString(2, c.getParty());
			statement.setInt(3, c.getVotes());
			
            int rowCount = statement.executeUpdate();
            return rowCount;
		}//statement.close();
	}
	
	public int update(Candidate c) throws SQLException{
		String sql = "UPDATE candidates SET name=?, party=?, votes=? WHERE id=?";
		try( PreparedStatement stmt = connection.prepareStatement(sql) ) {
			stmt.setString(1, c.getName());
			stmt.setString(2, c.getParty());
			stmt.setInt(3, c.getVotes());
			stmt.setInt(4, c.getId());
			
			int count = stmt.executeUpdate();
			return count;
		} // stmt.close();
	}
	
	public int deleteById(int id) throws SQLException {
		String deleteByIdQuery = "DELETE FROM candidates WHERE id=?";
		try(PreparedStatement statement = connection.prepareStatement(deleteByIdQuery)){
			statement.setInt(1, id);

			int count = statement.executeUpdate();
			return count;

		}//statement.close();
	}
	
	public Candidate findById(int id) throws SQLException {
		Candidate candidateFound = null;
		String findByIdQuery = "SELECT * FROM candidates WHERE id=?";
		
		try(PreparedStatement statement = connection.prepareStatement(findByIdQuery)){
			statement.setInt(1, id);
			
			try(ResultSet rSet = statement.executeQuery()) {
				while(rSet.next()) {
					id 				= rSet.getInt("id");
					String name 	= rSet.getString("name");
					String party 	= rSet.getString("party");
					int votes 		= rSet.getInt("votes");
					candidateFound = new Candidate(id, name, party, votes);
				}	
			}//rSet.close();
		}//statement.close()
		return candidateFound;
	}
	
	public List<Candidate> findAll() throws SQLException {
		List<Candidate> list = new ArrayList<Candidate>();
		String findAllQuery = "SELECT * FROM candidates";
		
		try(PreparedStatement statement = connection.prepareStatement(findAllQuery)) {

			try(ResultSet rs = statement.executeQuery()) {
				while(rs.next()) {
					int id = rs.getInt("id");
					String name = rs.getString("name");
					String party  = rs.getString("party");
					int votes = rs.getInt("votes");
					Candidate c = new Candidate(id, name, party, votes);
					list.add(c);
				}
			} // rs.close();
		} // stmt.close();
		return list;

	}
	public List<Candidate> findByParty(String party) throws Exception {
		List<Candidate> list = new ArrayList<>();
		String findByPartyQuery = "SELECT * FROM candidates WHERE party=?";
		
		try(PreparedStatement statement = connection.prepareStatement(findByPartyQuery)){
			statement.setString(1, party);
			
			try(ResultSet rSet = statement.executeQuery()) {
				while(rSet.next()) {
					int id 		= rSet.getInt("id");
					String name = rSet.getString("name");
					party 		= rSet.getString("party");
					int votes 	= rSet.getInt("votes");
					Candidate c = new Candidate(id, name, party, votes);
					list.add(c);
				}
			}//rSet.close();
		}//statement.close();
		return list;
	}
	
}
