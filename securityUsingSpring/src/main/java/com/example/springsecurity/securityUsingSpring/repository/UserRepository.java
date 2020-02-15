package com.example.springsecurity.securityUsingSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.springsecurity.securityUsingSpring.user.UserSecurity;

@Repository
public interface UserRepository extends JpaRepository<UserSecurity,String> {
   
}
