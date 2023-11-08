package com.falexthec.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.falexthec.course.entities.usa;
import com.falexthec.course.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<usa>findAll(){
		return repository.findAll();
	}
	
	public usa findById(Long id) {
		Optional<usa> obj = repository.findById(id);
		return obj.get();
	}

}
