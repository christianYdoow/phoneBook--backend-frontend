package com.EPhoneBookMo.phoneBook.services;

import com.EPhoneBookMo.phoneBook.model.UserEntity;
import com.EPhoneBookMo.phoneBook.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public ResponseEntity<HttpStatus> postUser(UserEntity userEntity){
        userRepository.save(userEntity);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    public List<UserEntity>getAllUser(){
        return userRepository.findAll();
    }

    public Optional<UserEntity> getUserById(long userId){
        return userRepository.findById(userId);
    }

    public ResponseEntity<HttpStatus>updateUserById(long userId,UserEntity userEntity){
        userEntity.setId(userId);
        userRepository.save(userEntity);
        return  new ResponseEntity<>(HttpStatus.OK);
    }

    public ResponseEntity<HttpStatus> deleteUserById(long userId){
        userRepository.deleteById(userId);
        return new ResponseEntity<>(HttpStatus.OK);
    }




}
