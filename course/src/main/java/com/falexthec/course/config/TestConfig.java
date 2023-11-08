package com.falexthec.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.falexthec.course.entities.usa;
import com.falexthec.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		usa u1 = new usa(null, "Danilo Xavier Fernandes", "danilo@gmail.com", "988888888", "123456"); 
		usa u2 = new usa(null, "Gustavo Xavier Fernandes", "gustavo@gmail.com", "977777777", "123456"); 
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		
	}

}
