package com.curso.user.services;

import com.curso.user.models.UserModel;
import com.curso.user.repositories.UserRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserServices {

    //Injetando o repository
    private UserRepo userRepository;

    //Métod0 responsável por inserir um novo usuário
    public UserModel insertUser (UserModel newUser){

        //Salvando no Banco de dados
        newUser = userRepository.save(newUser);
        System.out.println("===== Usuário Criado =====");
        System.out.println(newUser.toString());
        System.out.println("==========================");

        return newUser;
    }

    //Métod0 responsável por consultar todos os users
    public List<UserModel> getAllUsers (){

        List<UserModel> allusers = (List<UserModel>) userRepository.findAll();

        System.out.println("===== Usuários Encontrados =====");
        System.out.println(allusers.toString());
        System.out.println("================================");

        return allusers;
    }
}
