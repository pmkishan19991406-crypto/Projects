package com.kishan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.kishan.model.User;
import com.kishan.service.IUserService;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class UserController {

	@Autowired
	private IUserService userService;

	@PostMapping("/register")
	public void registerUser(@RequestBody User user) {
		userService.registerUser(user);
	}

	@PostMapping("/login")
	public User loginUser(@RequestParam String username,
			              @RequestParam String password) {

		return userService.loginUser(username, password);
	}

	@GetMapping("/{id}")
	public User getUserById(@PathVariable Integer id) {

		return userService.getUserById(id);
	}

	@GetMapping("/all")
	public List<User> getAllUsers() {

		return userService.getAllUsers();
	}

	@PutMapping("/update")
	public void updateUser(@RequestBody User user) {

		userService.updateUser(user);
	}

	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable Integer id) {

		userService.deleteUser(id);
	}

}