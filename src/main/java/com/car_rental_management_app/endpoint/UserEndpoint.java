package com.car_rental_management_app.endpoint;

import com.car_rental_management_app.entities.UserEntity;
import com.car_rental_management_app.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/users")
@AllArgsConstructor
public class UserEndpoint {
    @Autowired
    UserService userService;


    //Endpoint to create user

    @PostMapping("/createUser")
    public ResponseEntity<UserEntity> createUser(@RequestBody UserEntity user) {
        UserEntity createdUser = userService.saveUser(user);
        return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
    }


    @GetMapping("/getUserById/{userId}")
    public ResponseEntity<Optional<UserEntity>> getUserById(@PathVariable Long userId) {
        Optional<UserEntity> returnedUser = userService.findById(userId);
        return new ResponseEntity<>(returnedUser, HttpStatus.OK);
    }


    @PostMapping("/updateUser/{userId}")
    public ResponseEntity<UserEntity> updateUser(@RequestBody UserEntity user, @PathVariable Long userId) {
        UserEntity updatedUser = userService.updateUser(user, userId);
        return new ResponseEntity<>(updatedUser, HttpStatus.OK);
    }

    @DeleteMapping("/deleteUser/{userId}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long userId) {
        userService.deleteUser(userId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
