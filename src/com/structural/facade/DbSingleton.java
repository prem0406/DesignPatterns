package com.structural.facade;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbSingleton {

/*
 private static volatile DbSingleton instance = null;
	
	private Connection conn = null;
	
	private DbSingleton () {
		try {
			DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static DbSingleton getInstance() {
		if(instance == null) {
			synchronized(DbSingleton.class) {
				if (instance == null) {
					instance = new DbSingleton();
				}
			}
		}
		
		return instance;
	}
	
	public Connection getConnection() throws SQLException {
		if(conn == null || conn.isClosed()) {
			synchronized (DbSingleton.class) {
				if(conn == null || conn.isClosed()) {
					try {
						String dbUrl = "jdbc:derby:memory:codejava/webdb;create=true";
						
						conn = DriverManager.getConnection(dbUrl);
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}
		}
		
		return conn;
 */
	
	private static volatile DbSingleton instance = null;
	
	private Connection conn = null;
	
	private DbSingleton () {
		
	}
	
	public static DbSingleton getInstance() {
		if(instance == null) {
			synchronized(DbSingleton.class) {
				if (instance == null) {
					instance = new DbSingleton();
				}
			}
		}
		return instance;
	}
	
	 public Connection getConnection() {
		 
		 try {
			conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/test?" +
			         "user=root&password=root");
		} catch (SQLException e) {
			System.out.println("SQL connection failed!"+ e);
		}
		 return conn;
	 }
	
}
