package com.training.service;

import com.training.servlet.User;

public class Validator {

	public boolean validate(User user) {

		boolean result = false;

		if (user.getUserName().equals("Nikhil") && user.getPassword().equals("abcd")) {
			result = true;
		}

		return result;
	}

}