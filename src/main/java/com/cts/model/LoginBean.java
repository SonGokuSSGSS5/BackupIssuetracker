package com.cts.model;

import javax.validation.constraints.NotBlank;

public class LoginBean {

	@NotBlank(message = "Username is mandatory")
	private String userid;
	
	@NotBlank(message = "Password is Mandatory")
	private String password;

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public LoginBean() {
		
	}
	
}
