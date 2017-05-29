package com.struts.action;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ValidateLogin {

	Connection conn = null;
	boolean isvalid = false;

	public boolean validateLoginDetails(String username, String password) {
		try {
			System.out.println("Entering into the method");
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("*****************************************Class connected");
	        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Tech97", "root", "root");
			System.out.println("*****************************************Connection connected");
			String query = "select username,password from validate where username=?";
			System.out.println("*****************************************Query connected");
			PreparedStatement statement = conn.prepareStatement(query);
			statement.setString(1, username);
			ResultSet rs = statement.executeQuery();
			String usernameFromDB = null;
			String passwordFromDB = null;
			while (rs.next()) {
				usernameFromDB = rs.getString(1);
				passwordFromDB = rs.getString(2);

			}
			if (username.equals(usernameFromDB)
					&& password.equals(passwordFromDB)) {
				isvalid = true;
			} else
				isvalid = false;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return isvalid;

	}

}
