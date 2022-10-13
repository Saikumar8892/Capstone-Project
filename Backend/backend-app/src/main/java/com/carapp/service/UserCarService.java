package com.carapp.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.carapp.bean.UserCar;
import com.carapp.repository.UserCarRepository;

@Service
public class UserCarService {
	
	
	@Autowired
	UserCarRepository usercarRepository;
	
	public String storeUserCar(UserCar usercar) {
		usercarRepository.save(usercar);
		return "Car details stored";
	}
	
	public List<UserCar> getAllUserCars() {
		return usercarRepository.findAll();
	}
	
	
	
	public String deleteUserCar(int cid) {
		Optional<UserCar> result  = usercarRepository.findById(cid);
		if(result.isPresent()) {
			UserCar uc = result.get();
			usercarRepository.delete(uc);
			return "Car deleted successfully";
		}else {
			return "Car not present";
		}
	}
	
	public String updateUserCar(UserCar usercar) {
		Optional<UserCar> result  = usercarRepository.findById(usercar.getCid());
		if(result.isPresent()) {
			UserCar uc = result.get();
			uc.setCprice(usercar.getCprice());
			uc.setCmodel(usercar.getCmodel());
			uc.setUrl(usercar.getUrl());
			usercarRepository.saveAndFlush(uc);
			return "Car updated successfully";
		}else {
			return "Car not present";
		}
	}

}