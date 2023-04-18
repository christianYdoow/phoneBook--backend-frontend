package com.EPhoneBookMo.phoneBook.controller;


import com.EPhoneBookMo.phoneBook.model.UserEntity;
import com.EPhoneBookMo.phoneBook.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@CrossOrigin(origins = "http://localhost:4200 , http://localhost:80" )
@RestController
@RequestMapping("/contact")
public class UserController {

    @Autowired
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/users")
    public @ResponseBody ResponseEntity<HttpStatus>postUser(@RequestBody UserEntity userEntity){
        return userService.postUser(userEntity);
    }

    @GetMapping("/users")

    public List<UserEntity> getAllUser(){
        return userService.getAllUser();
    }

    @GetMapping("/users/{userid}")
    public Optional<UserEntity> getUserById(@PathVariable long userid){
        return userService.getUserById(userid);
    }

    @PutMapping("/users/{userid}")
    public ResponseEntity<HttpStatus> updateUserById(@PathVariable long userid, @RequestBody UserEntity userEntity){
        return userService.updateUserById(userid,userEntity);
    }

    @DeleteMapping("/users/{userid}")
    public ResponseEntity<HttpStatus> deleteUserById(@PathVariable long userid){
        return  userService.deleteUserById(userid);
    }


}
