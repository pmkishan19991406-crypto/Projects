package com.kishan.service;

import java.util.List;

import com.kishan.model.User;

public interface IUserService {
	
	public void registerUser(User user);

	public User loginUser(String username, String password);

	public User getUserById(Integer id);

	public List<User> getAllUsers();

	public void updateUser(User user);

	public void deleteUser(Integer id);

}
