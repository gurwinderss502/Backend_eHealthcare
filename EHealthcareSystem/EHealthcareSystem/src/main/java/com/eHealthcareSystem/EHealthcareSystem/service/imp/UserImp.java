package com.eHealthcareSystem.EHealthcareSystem.service.imp;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.eHealthcareSystem.EHealthcareSystem.Dto.LoginDTO;
import com.eHealthcareSystem.EHealthcareSystem.Dto.UserDTO;
import com.eHealthcareSystem.EHealthcareSystem.entity.User;
import com.eHealthcareSystem.EHealthcareSystem.repository.UserRepository;
import com.eHealthcareSystem.EHealthcareSystem.response.LoginResponse;
import com.eHealthcareSystem.EHealthcareSystem.service.UserService;

@Service
public class UserImp implements UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	@Override
	public String addUser(UserDTO userDTO) {
		// TODO Auto-generated method stub
		
		User user=new User( 
				
	   userDTO.getUserId(), 
	   userDTO.getUserFname(),
	   userDTO.getUserLname(),
	   userDTO.getEmail(),
	   userDTO.getPhone(),
	   userDTO.getGender(),
	   this.passwordEncoder.encode(userDTO.getPassword())
		);
		userRepository.save(user);
		return user.getUserFname();
	}

	@Override
	public LoginResponse loginUser(LoginDTO loginDTO)
	{
		 String msg = "";
	        User user1 = userRepository.findByEmail(loginDTO.getEmail());
	        if (user1 != null) {
	            String password = loginDTO.getPassword();
	            String encodedPassword = user1.getPassword();
	            Boolean isPwdRight = passwordEncoder.matches(password, encodedPassword);
	            if (isPwdRight) {
	                Optional<User> user = userRepository.findOneByEmailAndPassword(loginDTO.getEmail(), encodedPassword);
	                if (user.isPresent()) {
	                    return new LoginResponse("Login Success",true);
	                } else {
	                    return new LoginResponse("Login Failed",false);
	                }
	            } else {
	                return new LoginResponse("password Not Match",false);
	            }
	        }else {
	            return new LoginResponse("Email not exits",false);
	        }
	
	}
}
