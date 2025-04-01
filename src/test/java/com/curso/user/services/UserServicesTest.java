package com.curso.user.services;

import com.curso.user.models.UserModel;
import com.curso.user.repositories.UserRepo;
import org.apache.catalina.User;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class UserServicesTest {

    @InjectMocks
    private UserServices userServices;
    @Mock
    private UserRepo userRepo;

    @Test
    void insertUserOK() {

        UserModel user1 = new UserModel("Test","test@test.com");

        Mockito.when(userRepo.save(user1)).thenReturn(user1);

        assertNotNull(userServices.insertUser(user1));
    }

    @Test
    void getAllUsersOK() {
        UserModel user1 = new UserModel("MockA","MockA@test.com");
        UserModel user2 = new UserModel("MockB","MockB@test.com");

        List<UserModel> usersToRecover = List.of(user1,user2);

        Mockito.when(userRepo.findAll())
                .thenReturn(usersToRecover);

        List<UserModel> usersReturned = userServices.getAllUsers();

        assertSame(usersToRecover, usersReturned);
    }
}