package com.struts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ValidateLoginDetails {

	public Boolean validateLogin(String username, String password) {
		Connection conn = null;
		boolean isvalidate=false;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("DB Connection");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Tech97", "root", "root");
			System.out.println("Connection Successfull");
			String query = "select username,password from login where username=?";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(0, username);
			ps.setString(1, password);
		ResultSet rs=	ps.executeQuery();
		String UsernameFromDB=null;
		String PasswordFromDB=null;
		while(rs.next())
		{
			UsernameFromDB=rs.getString(1);
			PasswordFromDB=rs.getString(2);			
		}
		if(username.equals(UsernameFromDB)&&password.equals(PasswordFromDB))
		{
			isvalidate=true;
		}
		else
		{
			isvalidate= false;
		}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return isvalidate;

	}

}
