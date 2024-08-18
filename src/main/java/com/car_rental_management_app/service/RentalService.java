package com.car_rental_management_app.service;

import com.car_rental_management_app.repository.RentalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RentalService {
    @Autowired
    RentalRepository rentalRepository;

}
