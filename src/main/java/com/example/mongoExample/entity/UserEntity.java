package com.example.mongoExample.entity;

import java.util.HashMap;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class UserEntity {

    @Id
    private String id;
    private String name;
    private String surname;
    private HashMap attributes;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public HashMap getAttributes() {
        return attributes;
    }
    public void setAttributes(HashMap attributes) {
        this.attributes = attributes;
    }

    
}
