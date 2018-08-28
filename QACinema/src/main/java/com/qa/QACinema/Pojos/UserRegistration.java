package com.qa.QACinema.Pojos;

public class UserRegistration {
	
	private String username;
	private String password;
	private String passwordConfirmation;
	
	public UserRegistration() {
		
	}
	
	
	public UserRegistration(String username, String password, String passwordConfirmation) {
		super();
		this.username = username;
		this.password = password;
		this.passwordConfirmation = passwordConfirmation;
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
	public String getPasswordConfirmation() {
		return passwordConfirmation;
	}
	public void setPasswordConfirmation(String passwordConfirmation) {
		this.passwordConfirmation = passwordConfirmation;
	}

}
