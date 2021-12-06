package com.bitlabs.springsecurityExample.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;





@Entity
@Table(uniqueConstraints = @UniqueConstraint(name="unique_values",columnNames = {"username"}))
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String full_name;
	
	private String roles;
	public String getRoles() {
		return roles;
	}
	public void setRoles(String roles) {
		this.roles = roles;
	}
	private String username;
	
	
	private String password;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date created_at;
	
	@PrePersist
	public void onCreate() {
		created_at=new java.util.Date();
	}
	public String getFull_name() {
		return full_name;
	}
	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
