package com.car_rental_management_app.endpoint;

import com.car_rental_management_app.service.RentalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/rentals")
public class RentalEndpoint {

    @Autowired
    RentalService rentalService;
}
