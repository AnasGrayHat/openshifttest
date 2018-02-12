package com.example;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.dao.UserRepository;
import com.example.demo.entities.User;


@SpringBootApplication
public class OpenshiftTestApplication {

	
	@Autowired
	private UserRepository userRepo;
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(OpenshiftTestApplication.class, args);
		
		
		
		
		
		
	}
	
	
	@Bean
	InitializingBean sendDatabase() {
	    return () -> {
	    	
//	    	userRepo.save(new User("John" , "abou.mail@gmail.com"));
	    	
	      };
	   }
	
	
}
