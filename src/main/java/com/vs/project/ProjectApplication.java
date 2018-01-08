package com.vs.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Repository;

@SpringBootApplication
public class ProjectApplication {

	@Autowired
	messageRepository repo;
	public static void main(String[] args) {


		SpringApplication.run(ProjectApplication.class, args);


	}
}

