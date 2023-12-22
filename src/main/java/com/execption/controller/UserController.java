package com.execption.controller;

import com.execption.model.User;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @PostMapping("/send")
    public ResponseEntity<Object> save( @RequestBody @Valid User user){

        return new ResponseEntity<>(user, HttpStatus.ACCEPTED);
    }
}
