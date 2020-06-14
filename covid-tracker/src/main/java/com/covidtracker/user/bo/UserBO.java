package com.covidtracker.user.bo;

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
		userRepository.save(user);
	}

}
