package com.aguja.app.Service;

import javax.validation.Valid;

import com.aguja.app.Entity.User;

public interface UserService {

	public Iterable<User> getAllUsers();

	public User createUser(User user) throws Exception;
		
}