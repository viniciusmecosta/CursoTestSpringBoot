package com.curso.user.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserModelTest {

    @Test
    @DisplayName("Teste do objeto UserModel")
    void createUserModel() {
        UserModel userModel1 = new UserModel("Test","Test@test.com");

        assertNotNull(userModel1);

    }
    @Test
    @DisplayName("Teste UserModel nao vazio")
    void createUserModelNotEmpty(){
        UserModel userModel1 = new UserModel("Test","Test@test.com");
        assertEquals(userModel1.getName().isEmpty(),false);
        assertEquals(userModel1.getMail().isEmpty(),false);

    }

}