package com.struts.Action;

public class LoginAction {
	
	private String username;
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String execute()
	{
		String forward=null;
		System.out.println("Im in the method.......");
		if(getUsername().equals("test")&&getPassword().equals("test"))
		{
			forward="success";
		}
		else
		{
			forward="failure";
		}
		return forward;
	}

}
