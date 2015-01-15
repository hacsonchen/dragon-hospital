package com.stpass.dragon.hospital.domain;

/**
 * Operator Model
 * @author chenqs@stpass.com
 * @version Operator.java, v0.1 2014/12/30
 */

public class OperatorBean implements java.io.Serializable {
	
	private static final long serialVersionUID = -7125804607627302483L;
	
	private int id;
	private String name;
	private String title;
	private String username;
	private String password;	
	private boolean available;
	
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id  = id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getUsername() {
		return this.username;
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

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}		

}