package com.carapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carapp.bean.UserCar;



@Repository
public interface UserCarRepository extends JpaRepository<UserCar, Integer> {

}
