package com.aguja.app.Service;

<<<<<<< HEAD

import java.util.Optional;

import javax.validation.Valid;

=======
>>>>>>> f2151a192d015687934e6b58b253f03df2e006d8
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aguja.app.Entity.User;
import com.aguja.app.Repository.UserRepository;

<<<<<<< HEAD

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository repository;
	
	@Override
	public Iterable<User> getAllUsers() {
		return repository.findAll();
	}
	
	private boolean checkUsernameAvailable(User user) throws Exception {
		Optional<User> userFound = repository.findByUsername(user.getUsername());
		if (userFound.isPresent()) {
			throw new Exception("Username no disponible");
		}
		return true;
	}

	private boolean checkPasswordValid(User user) throws Exception {
		if ( !user.getPassword().equals(user.getConfirmPassword())) {
			throw new Exception("Password y Confirm Password no son iguales");
		}
		return true;
	}


	@Override
	public User createUser(User user) throws Exception {
		if (checkUsernameAvailable(user) && checkPasswordValid(user)) {
			user = repository.save(user);
		}
		return user;
	}
=======
@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository repository;

	@Override
	public Iterable<User> getAllUsers() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

>>>>>>> f2151a192d015687934e6b58b253f03df2e006d8
}
