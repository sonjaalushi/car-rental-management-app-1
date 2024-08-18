package com.car_rental_management_app.repository;

import com.car_rental_management_app.entities.RentalEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RentalRepository extends JpaRepository<RentalEntity, Long> {
}
