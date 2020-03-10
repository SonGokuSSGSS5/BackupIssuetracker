package com.cts.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="admintable")
public class AdminBean {

	@Id
	@NotBlank(message = "AdminId is mandatory")
	private String adminid;
	
	@NotBlank(message = "Password is Mandatory")
	private String password;

	
	public String getAdminid() {
		return adminid;
	}

	public void setAdminid(String adminid) {
		this.adminid = adminid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public AdminBean() {
		
	}
	
}
