package com.carapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carapp.bean.Car;
import com.carapp.repository.CarRepository;

@Service
public class CarService {
	
	@Autowired
	CarRepository carRepository;
	
	public String storeCar(Car car) {
		carRepository.save(car);
		return "Car details stored";
	}
	
	public List<Car> getAllCars() {
		return carRepository.findAll();
	}
	
	
	
	public String deleteCar(int cid) {
		Optional<Car> result  = carRepository.findById(cid);
		if(result.isPresent()) {
			Car c = result.get();
			carRepository.delete(c);
			return "Car deleted successfully";
		}else {
			return "Car not present";
		}
	}
	
	public String updateCar(Car car) {
		Optional<Car> result  = carRepository.findById(car.getCid());
		if(result.isPresent()) {
			Car c = result.get();
			c.setCprice(car.getCprice());
			c.setCmodel(car.getCmodel());
			c.setUrl(car.getUrl());
			carRepository.saveAndFlush(c);
			return "Car updated successfully";
		}else {
			return "Car not present";
		}
	}

}
