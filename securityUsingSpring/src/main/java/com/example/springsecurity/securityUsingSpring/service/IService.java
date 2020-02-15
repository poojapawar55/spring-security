package com.example.springsecurity.securityUsingSpring.service;

import java.util.List;

import com.example.springsecurity.securityUsingSpring.user.UserSecurity;


public interface IService {

//	String createUser(User user);
	List<UserSecurity> getAllUsers();
	String createUser(UserSecurity user);

	
}
