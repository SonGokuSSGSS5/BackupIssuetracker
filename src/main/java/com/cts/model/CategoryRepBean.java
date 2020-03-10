package com.cts.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Entity
@Table(name="categoryrep")
public class CategoryRepBean {

	@NotBlank(message = "FirstName should not be empty")
	private String firstname;
	
	@NotBlank(message = "LastName should not be empty")
	private String lastname;
	
	@NotBlank(message = "DOB should not be empty")
	private String dob;
	
	@NotBlank(message = "Gender should not be empty")
	private String gender;
	
	@NotBlank(message = "Contact Number should not be empty")	
	private String contactno;
	
	@NotBlank(message = "Category Rep Id should not be empty")
	@Id
	private String categoryrepid;
	
	@NotBlank(message = "Category should not be empty")
	private String category;
	
	@Pattern(regexp = "(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)\\w{8,25}",message = "Password should atleast 1 small ,1 capital ,1 number and have minimum 8 and maximum 25 characters")
	private String password;

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getContactno() {
		return contactno;
	}

	public void setContactno(String contactno) {
		this.contactno = contactno;
	}

	public String getCategoryrepid() {
		return categoryrepid;
	}

	public void setCategoryrepid(String categoryrepid) {
		this.categoryrepid = categoryrepid;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public CategoryRepBean() {

	}
	
}
