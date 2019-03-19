package com.example.boot;

import com.example.boot.answer3.User;
import com.example.boot.answer4and6.Database;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BootApplication {

	//Bean for Question3
	@Bean
	public User user(){

		User user = new User();
		user.setUsername("Rishabh");
		user.setPassword("mypassword");
		return user;
	}

	@Bean
	public Database database(){
		Database database =new Database();
		database.setName("Tomcat");
		database.setPort(8080);
		return database;
	}

	public static void main(String[] args) {
		SpringApplication.run(BootApplication.class, args);
	}

}
