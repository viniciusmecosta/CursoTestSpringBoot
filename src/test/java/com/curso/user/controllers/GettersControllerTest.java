package com.curso.user.controllers;

import com.curso.user.models.UserModel;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@ActiveProfiles("test")
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class GettersControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void status200OnGetAllUsers() {

        ResponseEntity<UserModel[]> allUsers = restTemplate.getForEntity("/allusers", UserModel[].class);

        UserModel[] allUsersGetted = allUsers.getBody();

        assertEquals(HttpStatusCode.valueOf(200), allUsers.getStatusCode());
        assertNotNull(allUsersGetted);

    }


}