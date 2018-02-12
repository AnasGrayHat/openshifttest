package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.UserRepository;


@RestController
public class OpenShiftController {

	
	@Autowired
	private UserRepository userRepo;
	
	
	@RequestMapping("/hello")
	public String hello()
	{
		
		return "hello wrold Mr , " + userRepo.findOne(1L).getName();
		
	}
	
	

	
	
	
	
}
