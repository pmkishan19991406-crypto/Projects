package com.kishan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kishan.model.User;

public interface UserRepositrory extends JpaRepository<User, Integer> {
	User findByUsernameAndPassword(String username, String password);

	User findByUsername(String username);
}
