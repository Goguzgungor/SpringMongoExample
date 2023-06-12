package com.example.mongoExample.repostery;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mongoExample.entity.UserEntity;

@RestController
@RequestMapping("/user")
public class UserApi {

    @Autowired
    private MongoDbRep mongoDbRep;

    @PostMapping("/add")
    public ResponseEntity<UserEntity> addUser(@RequestBody UserEntity user){
        UserEntity savedUser = mongoDbRep.save(user);
        return ResponseEntity.ok(savedUser);

    }

    @GetMapping("/list")
    public ResponseEntity<List<UserEntity>> listUser(){
        List<UserEntity> listUser = mongoDbRep.findAll();
        return ResponseEntity.ok(listUser);

    }
}
