package com.example.springsecurity.securityUsingSpring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springsecurity.securityUsingSpring.repository.UserRepository;
import com.example.springsecurity.securityUsingSpring.user.UserSecurity;


@Service
public class SecurityService implements IService {
   
	@Autowired
	UserRepository repository;
//	public String createUser(User user) {
//		
//		repository.save(user);
//		return "user added"+ user.getUsername();
//	}
	
	public List<UserSecurity> getAllUsers(){
		
  return (List<UserSecurity>) repository.findAll();
	}

	public String createUser(UserSecurity user){
		repository.save(user);
		return "added user with id";
	}

}
