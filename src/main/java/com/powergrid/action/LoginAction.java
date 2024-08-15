package com.powergrid.action;
import com.opensymphony.xwork2.ActionSupport;
import com.powergrid.db.dbconnection3;

public class LoginAction  extends ActionSupport {
	String username;
	String password;
	
	public String execute()
	{
		String retmessage="success";
		dbconnection3 dbcon = new dbconnection3();
		
		if(this.username == null || this.username.equalsIgnoreCase(""));
		{
			addActionError(getText("error.username"));
			retmessage= "error";
		}
		if(this.password == null  || this.password.equalsIgnoreCase(""));
		{
		addActionError(getText("error.password"));
		retmessage= "error";
		}
		if (retmessage.equalsIgnoreCase("success"))
		{
			if (!dbcon.checkusername(this.username))
			{
				addActionError(getText("error.usernameinvalid"));
				retmessage= "error";
			}
		}
		return retmessage;
	}

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

}
