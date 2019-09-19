package com.narcsoft.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.narcsoft.course.entities.User;
import com.narcsoft.course.repositories.UserRepository;



@Configuration
@Profile("test")
public class TesteConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		User u3 = new User(null, "Joao da Silva", "joao@gmail.com", "97777775", "1234");
		
		
		userRepository.saveAll(Arrays.asList(u1, u2, u3));
	}
	
	
	
}
