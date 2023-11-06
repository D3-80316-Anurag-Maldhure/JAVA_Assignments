package com.user;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class UserDao implements AutoCloseable{
	private Connection connection;

	public UserDao() throws SQLException {
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
	
	public int save(User u) throws SQLException{
		String saveQuery = "INSERT INTO users VALUES(default,?,?,?,?,?,?,?)";
		try(PreparedStatement statement = connection.prepareStatement(saveQuery)){
			statement.setString(1, u.getFirst_name());
			statement.setString(2, u.getLast_name());
			statement.setString(3, u.getEmail());
			statement.setString(4, u.getPassword());
			java.sql.Date sDate;
			sDate = new Date(u.getDob().getTime());
			statement.setDate(5, sDate); 
			statement.setInt(6, u.getStatus());
			statement.setString(7, u.getRole());

            int rowCount = statement.executeUpdate();
            return rowCount;
		}//statement.close();
	}
	
	public int update(User u) throws SQLException{
		String updateQuery = "UPDATE users SET first_name=?, last_name=?, email=?, password=?, dob=?, status=?, role=? WHERE id=?";
		try( PreparedStatement statement = connection.prepareStatement(updateQuery) ) {
			statement.setString(1, u.getFirst_name());
			statement.setString(2, u.getLast_name());
			statement.setString(3, u.getEmail());
			statement.setString(4, u.getPassword());
			java.sql.Date sDate;
			sDate = new Date(u.getDob().getTime());
			statement.setDate(5, sDate); 
			statement.setInt(6, u.getStatus());
			statement.setString(7, u.getRole());
			statement.setInt(7, u.getId());
			
			int count = statement.executeUpdate();
			return count;
		} // stmt.close();
	}
	
	public int deleteById(int id) throws SQLException {
		String deleteByIdQuery = "DELETE FROM users WHERE id=?";
		try(PreparedStatement statement = connection.prepareStatement(deleteByIdQuery)){
			statement.setInt(1, id);

			int count = statement.executeUpdate();
			return count;

		}//statement.close();
	}
	
	public User findById(int id) throws SQLException {
		User userFound = null;
		String findByIdQuery = "SELECT * FROM users WHERE id=?";
		
		try(PreparedStatement statement = connection.prepareStatement(findByIdQuery)){
			statement.setInt(1, id);
			
			try(ResultSet rSet = statement.executeQuery()) {
				while(rSet.next()) {
					id 				= rSet.getInt("id");
					String fname 	= rSet.getString("first_name");
					String lname	= rSet.getString("first_name");
					String email	= rSet.getString("email");
					String password	= rSet.getString("password");
					Date dob 		= rSet.getDate("dob"); 
					int status 		= rSet.getInt("status");
					String role		= rSet.getString("role");
					
					userFound = new User(id, fname, lname, email, password, dob, status, role);
				}	
			}//rSet.close();
		}//statement.close()
		return userFound;
	}
	
	public List<User> findAll() throws SQLException {
		List<User> list = new ArrayList<User>();
		String findAllQuery = "SELECT * FROM users";
		
		try(PreparedStatement statement = connection.prepareStatement(findAllQuery)) {

			try(ResultSet rSet = statement.executeQuery()) {
				while(rSet.next()) {
					int id 			= rSet.getInt("id");
					String fname 	= rSet.getString("first_name");
					String lname	= rSet.getString("last_name");
					String email	= rSet.getString("email");
					String password	= rSet.getString("password");
					Date dob 		= rSet.getDate("dob"); 
					int status 		= rSet.getInt("status");
					String role		= rSet.getString("role");
					
					User u = new User(id, fname, lname, email, password, dob, status, role);
					list.add(u);
				}
			} // rs.close();
		} // stmt.close();
		return list;

	}	
}
