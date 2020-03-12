package com.cts.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name="resolutiondb")
public class ResolutionBean {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int resolutionId;
	
	private int issueId;
	
	private String resolution;
	
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	private Date timeStamp;
	
	private String repId;
	
	public ResolutionBean(String resolution, String repId) {
		super();
		this.resolution = resolution;
		this.repId = repId;
	}

	



	public ResolutionBean(int issueId, String resolution, String repId, boolean notificationFlag) {
		super();
		this.issueId = issueId;
		this.resolution = resolution;
		this.repId = repId;
		this.notificationFlag = notificationFlag;
	}





	private boolean notificationFlag=false;
	
	


	public boolean isNotificationFlag() {
		return notificationFlag;
	}


	public void setNotificationFlag(boolean notificationFlag) {
		this.notificationFlag = notificationFlag;
	}


	@ManyToOne(fetch = FetchType.LAZY)
	private RaiseIssueBean rib;


	public int getResolutionId() {
		return resolutionId;
	}


	public void setResolutionId(int resolutionId) {
		this.resolutionId = resolutionId;
	}


	public int getIssueId() {
		return issueId;
	}


	public void setIssueId(int issueId) {
		this.issueId = issueId;
	}


	public String getResolution() {
		return resolution;
	}


	public void setResolution(String resolution) {
		this.resolution = resolution;
	}


	public Date getTimeStamp() {
		return timeStamp;
	}


	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}


	public String getRepId() {
		return repId;
	}


	public void setRepId(String repId) {
		this.repId = repId;
	}


	public RaiseIssueBean getRib() {
		return rib;
	}


	public void setRib(RaiseIssueBean rib) {
		this.rib = rib;
	}


	@Override
	public String toString() {
		return "ResolutionBean [resolutionId=" + resolutionId + ", issueId=" + issueId + ", resolution=" + resolution
				+ ", timeStamp=" + timeStamp + ", repId=" + repId + ", rib=" + rib + "]";
	}


	public ResolutionBean(int resolutionId, int issueId, String resolution, Date timeStamp, String repId,
			RaiseIssueBean rib) {
		super();
		this.resolutionId = resolutionId;
		this.issueId = issueId;
		this.resolution = resolution;
		this.timeStamp = timeStamp;
		this.repId = repId;
		this.rib = rib;
	}

	
	public ResolutionBean(int resolutionId, int issueId, String resolution, Date timeStamp, String repId,
			boolean notificationFlag, RaiseIssueBean rib) {
		super();
		this.resolutionId = resolutionId;
		this.issueId = issueId;
		this.resolution = resolution;
		this.timeStamp = timeStamp;
		this.repId = repId;
		this.notificationFlag = notificationFlag;
		this.rib = rib;
	}


	public ResolutionBean() {
		super();
	}
	
	
	
	

}
