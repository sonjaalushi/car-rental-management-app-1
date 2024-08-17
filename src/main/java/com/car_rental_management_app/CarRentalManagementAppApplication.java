package com.car_rental_management_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"com.car_rental_management_app.entities"})
public class CarRentalManagementAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarRentalManagementAppApplication.class, args);
	}

}
