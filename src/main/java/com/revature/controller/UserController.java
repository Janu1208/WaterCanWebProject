package com.revature.controller;

import com.google.gson.JsonObject;
import com.revature.model.User;
import com.revature.service.UserServices;

public class UserController {

	public String register(String name, String phone_number, String password)  {
		String errorMessage = null;
		String message = null;
		User user = null;
		try {
			user = new User();
			user.setName(name);
			user.setPhone_number(phone_number);
			user.setPassword(password);
			UserServices us = new UserServices();

			us.register(user);
			message = "Success";
		} catch (Exception e) {
			errorMessage = e.getMessage();
		}
		JsonObject obj = new JsonObject();
		if (message != null) {

			obj.addProperty("message", message);
		} else if (errorMessage != null) {
			obj.addProperty("errorMessage", errorMessage);
		}
		return obj.toString();
	}
}
