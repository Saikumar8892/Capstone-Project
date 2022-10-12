package com.carapp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carapp.bean.Login;
import com.carapp.repository.LoginRepository;

@Service
public class LoginService {
	
	@Autowired
	LoginRepository loginRepository;
	
	public String signIn(Login login) {
		Optional<Login> result = loginRepository.findById(login.getEmailid());
		if(result.isPresent()) {
			    Login ll = result.get();
			    if(ll.getPassword().equals(login.getPassword())) {
			    	if(ll.getTypeOfUser().equals("admin")) {
			    		return "Admin sucessfully login";
			    	}else {
			    		return "User sucessfully login";
			    	}
			    }else {
			    	return "Invalid password";
			    }
		}else {
			return "Invalid emailId";
		}
	}
			
	public String signUp(Login login) {
		Optional<Login> result = loginRepository.findById(login.getEmailid());
		if(result.isPresent()) {
			return "Email Id already exists";
		}else {
			Login ll = result.get();
			if(ll.getTypeOfUser().equals("admin")) {
				return "You can't create admin account";
			}else {
				loginRepository.save(login);
				return "Account created successfully";
			}
		}
	}
		
		
		
	}

		

