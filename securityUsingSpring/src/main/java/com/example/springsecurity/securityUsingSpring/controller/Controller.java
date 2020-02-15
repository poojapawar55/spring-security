package com.example.springsecurity.securityUsingSpring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.springsecurity.securityUsingSpring.service.IService;
import com.example.springsecurity.securityUsingSpring.user.UserSecurity;


@RestController
public class Controller {

	
	@Autowired
	IService serv;
	
	@PostMapping("/user")
	public String saveUser(@RequestBody UserSecurity user) {
		return serv.createUser(user);
	}

	@GetMapping("/findAllUsers")
	public List<UserSecurity> getmovieName() {
		return serv.getAllUsers();
	}
}
