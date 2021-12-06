package com.bitlabs.jobdetails.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Jobs {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private  long jid;
	private String jname;
	private String description,recurrance;
	private Date startdate,enddate;
	private long duration;
	private String tasks;
	
	public long getJid() {
		return jid;
	}
	public void setJid(long jid) {
		this.jid = jid;
	}
	public String getJname() {
		return jname;
	}
	public void setJname(String jname) {
		this.jname = jname;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getRecurrance() {
		return recurrance;
	}
	public void setRecurrance(String recurrance) {
		this.recurrance = recurrance;
	}
	public Date getStartdate() {
		return startdate;
	}
	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}
	public Date getEnddate() {
		return enddate;
	}
	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}
	public long getDuration() {
		return duration;
	}
	public void setDuration(long duration) {
		this.duration = duration;
	}
	public String getTasks() {
		return tasks;
	}
	public void setTasks(String tasks) {
		this.tasks = tasks;
	}
	
	

}
