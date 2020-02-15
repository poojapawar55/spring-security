package com.example.springsecurity.securityUsingSpring.jwtuserdetailservice;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class JwtUserDetailService implements UserDetailsService {


	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		if ("poojapawar".equals(username)) {
			return new User("poojapawar", "$2a$10$xtBqQLBo.WU7Th0zyqFH/.OOhTRu3X49x3T0qnSyPTjeE5YlGc6xW",
					new ArrayList<>());
		} else {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}
	}
}
