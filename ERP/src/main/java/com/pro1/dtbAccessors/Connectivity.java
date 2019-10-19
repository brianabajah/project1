package com.pro1.dtbAccessors;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connectivity extends Authentication{

	public Connection getCon() {
		try {
			Connection con = DriverManager.getConnection(getUrl(),getName(),getPass());
			return con;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
}
