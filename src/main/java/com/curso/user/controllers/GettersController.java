package com.curso.user.controllers;

import com.curso.user.models.UserModel;
import com.curso.user.services.UserServices;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class GettersController {

    //Injetando services
    private UserServices userServices;

    //Métod0 responsável pelo endpoint getAllUsers
    @GetMapping("/allusers")
    public List<UserModel> allUsers(){

        return userServices.getAllUsers();
    }
}
