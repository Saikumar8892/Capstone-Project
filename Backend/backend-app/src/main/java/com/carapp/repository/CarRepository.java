package com.carapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carapp.bean.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer>{

}