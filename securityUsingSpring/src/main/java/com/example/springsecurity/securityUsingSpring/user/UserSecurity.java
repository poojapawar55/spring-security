package com.example.springsecurity.securityUsingSpring.user;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class UserSecurity {

	@Id
	private String username;
	private String password;

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

	public UserSecurity(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public UserSecurity() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + "]";
	}

}
