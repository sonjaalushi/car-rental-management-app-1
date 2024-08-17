package com.car_rental_management_app.service;

import com.car_rental_management_app.entities.UserEntity;
import com.car_rental_management_app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService  {

    @Autowired UserRepository userRepository;

    //Method to  create user
    public UserEntity saveUser(UserEntity user){
        return userRepository.save(user);
    }


}
