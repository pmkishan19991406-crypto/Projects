package com.kishan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kishan.model.User;
import com.kishan.repository.UserRepositrory;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private UserRepositrory urepo;

	@Override
	public void registerUser(User user) {
		urepo.save(user);
	}

	@Override
	public User loginUser(String username, String password) {
		return urepo.findByUsernameAndPassword(username, password);
	}

	@Override
	public User getUserById(Integer id) {
		return urepo.findById(id).orElse(null);
	}

	@Override
	public List<User> getAllUsers() {
		return urepo.findAll();
	}

	@Override
	public void updateUser(User user) {
		urepo.save(user);
	}

	@Override
	public void deleteUser(Integer id) {
		urepo.deleteById(id);
	}

}