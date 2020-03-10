package com.cts.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import org.springframework.stereotype.Component;

@Component
public class MailFormBean {
	
@NotBlank
private String Name;
@Email
private String EmailId;
@NotBlank
private String subject;
@NotBlank
private String content;



public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getEmailId() {
	return EmailId;
}
public void setEmailId(String emailId) {
	EmailId = emailId;
}
public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}


}
