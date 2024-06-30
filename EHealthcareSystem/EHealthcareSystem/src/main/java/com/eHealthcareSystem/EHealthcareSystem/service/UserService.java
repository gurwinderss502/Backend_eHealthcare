package com.eHealthcareSystem.EHealthcareSystem.service;

import com.eHealthcareSystem.EHealthcareSystem.Dto.LoginDTO;
import com.eHealthcareSystem.EHealthcareSystem.Dto.UserDTO;
import com.eHealthcareSystem.EHealthcareSystem.response.LoginResponse;


public interface UserService {

	String addUser(UserDTO userDTO);

	LoginResponse loginUser(LoginDTO loginDTO);

	
}
