package com.time;


import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.time.dao.UserRepository;
import com.time.entities.Admin;
import com.time.entities.DRH;

import com.time.entities.User;


@SpringBootApplication
@ImportResource("spring-beans.xml")
public class GformationApplication {
	
@Autowired
private UserRepository userRepository ;

	public static void main(String[] args) {
	  SpringApplication.run(GformationApplication.class, args);
	 
	 
	}

	
}
