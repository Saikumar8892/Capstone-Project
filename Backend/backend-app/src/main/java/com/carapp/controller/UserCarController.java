package com.carapp.controller;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.carapp.bean.UserCar;
import com.carapp.service.UserCarService;

@RestController
@RequestMapping("usercar")
@CrossOrigin
public class UserCarController {
	
	@Autowired
	UserCarService usercarService;
	
	
	@PostMapping(value = "storeUserCar",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String storeUserCar(@RequestBody UserCar usercar) {
		return usercarService.storeUserCar(usercar);
	}
	
	@PatchMapping(value = "updateUserCar",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String updateUserCar(@RequestBody UserCar usercar) {
		return usercarService.updateUserCar(usercar);
	}
	
	@GetMapping(value="findAllUserCar",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<UserCar> getAllUserCar() {
		return usercarService.getAllUserCars();
	}
	
	@DeleteMapping(value="deleteUserCar/{cid}")
	public String deleteUserCarUsingId(@PathVariable("cid") int cid) {
		return usercarService.deleteUserCar(cid);
	}

}
