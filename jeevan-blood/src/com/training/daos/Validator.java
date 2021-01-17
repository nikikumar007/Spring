package com.training.daos;

import com.training.model.User;

public class Validator {
	 
	private String username="Nikhil";
	private String password="abcd";
	
	public boolean validate(String user,String pass)
	{
		if(user.equals(username) && pass.equals(password))
		{
			return true;
		}
		else {
			return false;
		}
	}

}