package com.pro1.DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.pro1.dtbAccessors.Connectivity;
import com.pro1.reimburse.users.Users;

public class UserDao {

	public int addNewEmployees(Users users) {
		Connectivity conev= new Connectivity();
		Connection con= conev.getCon();
//		String[] values= {users.getRole_id(),}
		String sql="insert into ers_users(user_role_id,ers_username,ers_password,"
						+ "user_first_name,user_last_name,user_email) values(?,?,?,?,?,?)"
						+ "on conflict(user_email) do nothing";
		
		try {
			PreparedStatement prep = con.prepareStatement(sql);
			prep.setInt(1, users.getRole_id());
			prep.setString(2, users.getUserName());
			prep.setString(3, users.getPassword());
			prep.setString(4, users.getUserFirstName());
			prep.setString(5, users.getUserLastName());
			prep.setString(6, users.getUserEmail());
			return prep.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		}
	}
	
	
	public Users getEmployees(String username) {
		Connectivity conev= new Connectivity();
		Connection con= conev.getCon();
		
		String sql="select * from ers_users where ers_username=?;";
		
		Users emp = null;
		
		try {			
			PreparedStatement prep = con.prepareStatement(sql);
			prep.setString(1, username);
			ResultSet rs = prep.executeQuery();
			
			while(rs.next()) {
				 emp = new Users(rs.getInt("ers_users_id"),rs.getInt("user_role_id"), rs.getString("ers_username"), rs.getString("ers_password"), rs.getString("user_first_name"), rs.getString("user_last_name"),
						rs.getString("user_email"));
			}
			return emp;
		} catch (SQLException e) {
			e.printStackTrace();
			return emp;
		}
	}
	
}
