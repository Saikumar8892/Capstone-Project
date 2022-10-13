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

import com.carapp.bean.Car;
import com.carapp.service.CarService;

@RestController
@RequestMapping("car")
@CrossOrigin
public class CarController {
	
	@Autowired
	CarService carService;
	
	
	@PostMapping(value = "storeCar",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String storeCar(@RequestBody Car car) {
		return carService.storeCar(car);
	}
	
	@PatchMapping(value = "updateCar",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String updateCar(@RequestBody Car car) {
		return carService.updateCar(car);
	}
	
	@GetMapping(value="findAllCar",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Car> getAllCar() {
		return carService.getAllCars();
	}
	
	@DeleteMapping(value="deleteCar/{cid}")
	public String deleteCarUsingId(@PathVariable("cid") int cid) {
		return carService.deleteCar(cid);
	}

}
