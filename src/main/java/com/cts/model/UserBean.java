package com.cts.model;

//import java.util.String;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;




@Entity
@Table(name="user")
public class UserBean {
	
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
	
	@NotBlank(message = "UserId should not be empty")
	@Id
	private String userid;
	
	@Pattern(regexp = "(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)\\w{8,25}",message = "Password should atleast 1 samll ,1 capital ,1 number and have minimun 8 and maximum 25 characters")
	private String password;
	
	@NotBlank(message = "Choose security question 1")
	private String squestion1;
	
	@NotBlank(message = "Answer the security question 1")
	private String sanswer1;
	
	@NotBlank(message = "Choose security question 2")
	private String squestion2;

	@NotBlank(message = "Answer the security question 2")
	private String sanswer2;
	
	@NotBlank(message = "Choose security question 3")
	private String squestion3;
	
	@NotBlank(message = "Answer the security question 3")
	private String sanswer3;
	
	
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

	public String getSquestion1() {
		return squestion1;
	}

	public void setSquestion1(String squestion1) {
		this.squestion1 = squestion1;
	}

	public String getSanswer1() {
		return sanswer1;
	}

	public void setSanswer1(String sanswer1) {
		this.sanswer1 = sanswer1;
	}

	public String getSquestion2() {
		return squestion2;
	}

	public void setSquestion2(String squestion2) {
		this.squestion2 = squestion2;
	}

	public String getSanswer2() {
		return sanswer2;
	}

	public void setSanswer2(String sanswer2) {
		this.sanswer2 = sanswer2;
	}

	public String getSquestion3() {
		return squestion3;
	}

	public void setSquestion3(String squestion3) {
		this.squestion3 = squestion3;
	}

	public String getSanswer3() {
		return sanswer3;
	}

	public void setSanswer3(String sanswer3) {
		this.sanswer3 = sanswer3;
	}

	public UserBean() {
		
	}

	@Override
	public String toString() {
		return "UserBean [firstname=" + firstname + ", lastname=" + lastname + ", dob=" + dob + ", gender=" + gender
				+ ", contactno=" + contactno + ", userid=" + userid + ", password=" + password + ", squestion1="
				+ squestion1 + ", sanswer1=" + sanswer1 + ", squestion2=" + squestion2 + ", sanswer2=" + sanswer2
				+ ", squestion3=" + squestion3 + ", sanswer3=" + sanswer3 + "]";
	}
	
	
}
