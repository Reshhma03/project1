package com.example.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.UserModel;
import com.example.demo.service.LoginService;
@RestController
@Service
public class LoginController {
	@Autowired
	private LoginService lser;
	//To log in:
	
	@PostMapping("/login")
	public String login(@RequestBody Map<String,String>loginData)
	{
		String username=loginData.get("username");
		String password=loginData.get("password");
		String result=lser.checkLogin(username,password);
		return result;
	}
	//To add users
	
	@PostMapping("/add")
	public UserModel AddUser(@RequestBody UserModel cl)
	{
		return lser.addUser(cl);
	}

	@GetMapping("/getuser")
	public List<UserModel> listAll()
	{
		return lser.getUser();
	}

}
