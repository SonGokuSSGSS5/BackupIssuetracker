package com.cts.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.stereotype.Component;

@Entity
@Table(name="usernotification")
public class UserNotificationBean {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int notificationId;
	
	
	private String Message;
	
	private String User;
	
	private String notificationCause;
	
	private boolean click=false;
	
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	private Date timestamp;

	public int getNotificationId() {
		return notificationId;
	}

	public void setNotificationId(int notificationId) {
		this.notificationId = notificationId;
	}

	public String getMessage() {
		return Message;
	}

	public void setMessage(String message) {
		Message = message;
	}

	public String getUser() {
		return User;
	}

	public void setUser(String user) {
		User = user;
	}

	public String getNotificationCause() {
		return notificationCause;
	}

	public void setNotificationCause(String notificationCause) {
		this.notificationCause = notificationCause;
	}

	public boolean isClick() {
		return click;
	}

	public void setClick(boolean click) {
		this.click = click;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public UserNotificationBean() {
		super();
	}

	@Override
	public String toString() {
		return "UserNotificationBean [notificationId=" + notificationId + ", Message=" + Message + ", User=" + User
				+ ", notificationCause=" + notificationCause + ", click=" + click + ", timestamp=" + timestamp + "]";
	}
	
	

}
