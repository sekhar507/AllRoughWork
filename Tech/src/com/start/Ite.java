package com.start;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.jdbc.PreparedStatement;

public class Ite {

	public static void main(String[] args) {

		try {
			
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/Tech97", "root", "root");
			
			// Connection Done .......
			

			
		java.sql.PreparedStatement stmt= conn.prepareStatement("delete from Employee where id = ?");
		stmt.setInt(1,2);
		
		int i = stmt.executeUpdate();
		System.out.println(i+"Deletion Done SuucessFully");
			
			
			
			
			
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
