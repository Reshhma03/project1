package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.UserModel;

public interface LoginRepo extends JpaRepository<UserModel, Integer> {
	UserModel findByusername(String username);

}
