package com.capg.login.model;

public class Login {

	private int userId;
	private String password;
	
	public Login() {
		
	}

	public Login(int userId, String password) {
		super();
		this.userId = userId;
		this.password = password;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Login [userId=" + userId + ", password=" + password + "]";
	}
}
