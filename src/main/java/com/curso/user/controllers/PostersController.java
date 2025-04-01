package com.curso.user.controllers;

import com.curso.user.models.UserModel;
import com.curso.user.services.UserServices;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor

public class PostersController {

    //Injetando o service
    private UserServices userServices;

    //Métod0 responsável por criar um novo user;
    @PostMapping("/newuser")
    public ResponseEntity<UserModel> createNewUser (@RequestBody @Valid UserModel newUser){

        return ResponseEntity.status(HttpStatus.CREATED).body(userServices.insertUser(newUser));
    }
}
