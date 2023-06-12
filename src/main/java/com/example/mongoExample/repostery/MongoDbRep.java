package com.example.mongoExample.repostery;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.mongoExample.entity.UserEntity;

public interface MongoDbRep extends MongoRepository<UserEntity, String> {
    
}
