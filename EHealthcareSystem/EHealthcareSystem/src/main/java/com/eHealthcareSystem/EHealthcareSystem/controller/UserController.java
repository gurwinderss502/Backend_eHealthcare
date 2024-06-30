package com.eHealthcareSystem.EHealthcareSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eHealthcareSystem.EHealthcareSystem.Dto.LoginDTO;
import com.eHealthcareSystem.EHealthcareSystem.Dto.UserDTO;
import com.eHealthcareSystem.EHealthcareSystem.response.LoginResponse;
import com.eHealthcareSystem.EHealthcareSystem.service.UserService;

@RestController
@CrossOrigin
@RequestMapping("/api/v1")


public class UserController {
	

    @Autowired
    private UserService userService;
	
	@PostMapping("/save")
	public String saveUser(@RequestBody UserDTO userDTO)
	{
		String id=userService.addUser(userDTO);
		return id;  
	}
	
	 @PostMapping("/login")
	    public ResponseEntity<?> loginUser(@RequestBody LoginDTO loginDTO)
	    {
	        LoginResponse loginResponse = userService.loginUser(loginDTO);
	        return ResponseEntity.ok(loginResponse);
	    }

}
