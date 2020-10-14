package com.ejercicio.javamysqldocker.controller;

import com.ejercicio.javamysqldocker.model.User;
import com.ejercicio.javamysqldocker.service.UserService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class UserController {

    @Autowired(required=true)
    private UserService userService;

    protected ObjectMapper mapper;

    @PostMapping("/saveOrUpdate")
    public ResponseEntity saveOrUpdate(@RequestBody String userJson) throws IOException {

        this.mapper = new ObjectMapper();
        int i =0;

        User user = this.mapper.readValue(userJson,User.class);

        if(!userIsValid(user)){
            return new ResponseEntity(HttpStatus.NOT_ACCEPTABLE);
        }else{
            userService.save(user);
        }
        return new ResponseEntity(HttpStatus.OK);
    }

    private boolean userIsValid(User user) {
        boolean valid = true;
        if(null == user.getFirstName()){
            valid = false;
        }
        if(null == user.getFirstSurename()){
            valid = false;
        }
        if(null == user.getAddress()){
            valid = false;
        }
        return valid;
    }
}
