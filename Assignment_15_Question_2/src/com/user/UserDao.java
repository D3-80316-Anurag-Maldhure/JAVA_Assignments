package com.user;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.management.loading.PrivateClassLoader;


public class UserDao implements AutoCloseable{
	private Connection connection;
	
	//for faster execution - Since PrepareStatement - An object that represents a precompiled SQL statement (Refer Javadocs) 
	private final PreparedStatement saveStatement;
	private final PreparedStatement updateStatement;
	private final PreparedStatement deleteByIdStatement;
	private final PreparedStatement findByIdStatement;
	private final PreparedStatement findAllStatement;

	public UserDao() throws SQLException {
		this.connection = DBUtil.getConnection();
		saveStatement 		= connection.prepareStatement("INSERT INTO users VALUES(default,?,?,?,?,?,?,?)");
		updateStatement 	= connection.prepareStatement("UPDATE users SET first_name=?, last_name=?, email=?, password=?, dob=?, status=?, role=? WHERE id=?");
		deleteByIdStatement = connection.prepareStatement("DELETE FROM users WHERE id=?");
		findByIdStatement  	= connection.prepareStatement("SELECT * FROM users WHERE id=?");
		findAllStatement	= connection.prepareStatement("SELECT * FROM users");
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
		try{
			saveStatement.setString(1, u.getFirst_name());
			saveStatement.setString(2, u.getLast_name());
			saveStatement.setString(3, u.getEmail());
			saveStatement.setString(4, u.getPassword());
			java.sql.Date sDate;
			sDate = new Date(u.getDob().getTime());
			saveStatement.setDate(5, sDate); 
			saveStatement.setInt(6, u.getStatus());
			saveStatement.setString(7, u.getRole());

            int rowCount = saveStatement.executeUpdate();
            return rowCount;
		}
		finally {
			saveStatement.close();
		}
		
	}
	
	public int update(User u) throws SQLException{
		try{
			updateStatement.setString(1, u.getFirst_name());
			updateStatement.setString(2, u.getLast_name());
			updateStatement.setString(3, u.getEmail());
			updateStatement.setString(4, u.getPassword());
			java.sql.Date sDate;
			sDate = new Date(u.getDob().getTime());
			updateStatement.setDate(5, sDate); 
			updateStatement.setInt(6, u.getStatus());
			updateStatement.setString(7, u.getRole());
			updateStatement.setInt(8, u.getId());
			
			int count = updateStatement.executeUpdate();
			return count;
		}
		finally {
			updateStatement.close();
		}
	}
	
	public int deleteById(int id) throws SQLException {
		try{
			deleteByIdStatement.setInt(1, id);

			int count = deleteByIdStatement.executeUpdate();
			return count;

		}
		finally {
			deleteByIdStatement.close();
		}
	}
	
	public User findById(int id) throws SQLException {
		User userFound = null;
		try{
			findByIdStatement.setInt(1, id);
			
			try(ResultSet rSet = findByIdStatement.executeQuery()) {
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
		}
		finally {
			findByIdStatement.close();
		}
		return userFound;
	}
	
	public List<User> findAll() throws SQLException {
		List<User> list = new ArrayList<User>();
		
		try{

			try(ResultSet rSet = findAllStatement.executeQuery()) {
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
		} 
		finally {
			findAllStatement.close();
		}
		return list;

	}	
}
