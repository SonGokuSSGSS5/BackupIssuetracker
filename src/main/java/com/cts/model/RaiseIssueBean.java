package com.cts.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name="issueDB")
public class RaiseIssueBean {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int id;
	@NotBlank(message = "Category is mandatory")
	private String category;
	@NotBlank(message = "Topic is mandatory")
	private String topic;
	@NotBlank(message = "Issue is mandatory")
	private String description;
	
	
	private String status="Active";
	private String askedby;
	
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	private Date timestamp;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "issueId")
	private List<ResolutionBean> resolutions;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getAskedby() {
		return askedby;
	}

	public void setAskedby(String askedby) {
		this.askedby = askedby;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public RaiseIssueBean(int id, String category, String topic, String description, String status, String askedby,
			Date timestamp) {
		super();
		this.id = id;
		this.category = category;
		this.topic = topic;
		this.description = description;
		this.status = status;
		this.askedby = askedby;
		this.timestamp = timestamp;
	}

	public RaiseIssueBean() {
		super();
	}

	public RaiseIssueBean(String category, String topic, String description, String askedby) {
		super();
		this.category = category;
		this.topic = topic;
		this.description = description;
		this.askedby = askedby;
		this.status="Active";
	}

	public RaiseIssueBean(String category, String topic, String description) {
		super();
		this.category = category;
		this.topic = topic;
		this.description = description;
		this.status="Active";
	}
	
	
	

	
	
	
	
	
}
