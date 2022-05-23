package com.mauri.mongo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mauri.mongo.document.User;
import com.mauri.mongo.service.UserService;

@RestController
@RequestMapping("")
public class UserController {
	@Autowired
	UserService userService;
	
	@GetMapping("/user")
	public List<User> getAll() {
		return userService.getAll();
	} 
	
	@PostMapping("/user")
	public User create(@RequestBody User user) {
		return userService.create(user);
	}
}
