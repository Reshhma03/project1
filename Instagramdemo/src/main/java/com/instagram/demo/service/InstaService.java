package com.instagram.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.instagram.demo.dao.StudentRepositoty;
import com.instagram.demo.model.student;

@Service
public class InstaService {

	@Autowired
	StudentRepositoty rs;
	
	public List<student> getAll(){
		
		return rs.findAll();
	}
	public student saveall(student id) {
		return rs.save(id);
	}
}