package com.covidtracker.user.bo;

import java.sql.Date;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.covidtracker.user.dao.UserRepository;
import com.covidtracker.user.dto.UserDTO;
import com.covidtracker.user.entity.User;

@Service
public class UserBO {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private BCryptPasswordEncoder bCryptEncoder;
	
	public void saveUser(UserDTO userDTO)
	{
		User user = new User();	
		user.setUsername(userDTO.getUsername());
		user.setPassword(bCryptEncoder.encode(userDTO.getPassword()));
		user.setDateCreated(new java.sql.Date(System.currentTimeMillis()));
		userRepository.save(user);
	}

}
