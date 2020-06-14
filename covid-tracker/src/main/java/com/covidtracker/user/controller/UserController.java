package com.covidtracker.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.covidtracker.user.bo.UserBO;
import com.covidtracker.user.dto.UserDTO;

@RestController
public class UserController {
	
	@Autowired
	private UserBO userBO;
	
	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(method=RequestMethod.POST, value = "/signup")	
	public void createUserAccount(@RequestBody UserDTO userDTO)
	{
		userBO.saveUser(userDTO);
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(method=RequestMethod.POST, value = "/custom_login")
	public String login()
	{
		return "Authenticated";
	}

}
