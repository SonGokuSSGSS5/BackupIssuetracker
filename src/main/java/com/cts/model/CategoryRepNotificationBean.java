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
@Table(name="repnotification")
public class CategoryRepNotificationBean {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int notificationId;
	
	
	private String Message;
	
	private String CategoryRep;
	
	public String getCategoryRep() {
		return CategoryRep;
	}

	public void setCategoryRep(String categoryRep) {
		CategoryRep = categoryRep;
	}

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

	@Override
	public String toString() {
		return "CategoryRepNotificationBean [notificationId=" + notificationId + ", Message=" + Message
				+ ", CategoryRep=" + CategoryRep + ", notificationCause=" + notificationCause + ", click=" + click
				+ ", timestamp=" + timestamp + "]";
	}

	public String getMessage() {
		return Message;
	}

	public void setMessage(String message) {
		Message = message;
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

	public CategoryRepNotificationBean() {
		super();
	}
	
	

}
