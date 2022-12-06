package com.example.demo.service;

import org.springframework.stereotype.Repository;

import com.example.demo.entities.Role;
import com.example.demo.entities.User;
@Repository
public interface UserService {
	
	User saveUser(User user);
	User findUserByUsername (String username);
	Role addRole(Role role);
	User addRoleToUser(String username, String rolename);
	

}
