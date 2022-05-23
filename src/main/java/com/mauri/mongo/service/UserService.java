package com.mauri.mongo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mauri.mongo.document.User;
import com.mauri.mongo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> getAll(){
		return repository.findAll();
	}
	
	public User create(User user) {
		return repository.insert(user);
	}
}
