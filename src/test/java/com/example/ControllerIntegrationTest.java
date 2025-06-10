// src/test/java/com/example/ControllerIntegrationTest.java

package com.example;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ControllerIntegrationTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    private String baseUrl(String path) {
        return "http://localhost:" + port + path;
    }

    @Test
    public void testUserRegisterAndLogin() {
        // Register
        Map<String, Object> registerBody = new HashMap<>();
        registerBody.put("username", "testuser1");
        registerBody.put("password", "testpass1");
        registerBody.put("openid", "openid_test1");
        registerBody.put("roleId", 1);
        registerBody.put("coins", 100);

        ResponseEntity<String> registerResponse = restTemplate.postForEntity(
                baseUrl("/api/users/register"),
                registerBody,
                String.class
        );

        System.out.println("User Register Response: " + registerResponse.getBody());
        assert registerResponse.getStatusCode() == HttpStatus.OK;

        // Login
        Map<String, Object> loginBody = new HashMap<>();
        loginBody.put("username", "testuser1");
        loginBody.put("password", "testpass1");
        loginBody.put("openid", "");

        ResponseEntity<String> loginResponse = restTemplate.postForEntity(
                baseUrl("/api/users/login"),
                loginBody,
                String.class
        );

        System.out.println("User Login Response: " + loginResponse.getBody());
        assert loginResponse.getStatusCode() == HttpStatus.OK;
    }

    @Test
    public void testRoleApi() {
        ResponseEntity<String> response = restTemplate.getForEntity(
                baseUrl("/api/role"),
                String.class
        );
        System.out.println("Role API Response: " + response.getBody());
        assert response.getStatusCode() == HttpStatus.OK;
    }

    @Test
    public void testRankApi() {
        ResponseEntity<String> response = restTemplate.getForEntity(
                baseUrl("/api/rank"),
                String.class
        );
        System.out.println("Rank API Response: " + response.getBody());
        assert response.getStatusCode() == HttpStatus.OK;
    }

    @Test
    public void testSpriteApi() {
        ResponseEntity<String> response = restTemplate.getForEntity(
                baseUrl("/api/sprite"),
                String.class
        );
        System.out.println("Sprite API Response: " + response.getBody());
        assert response.getStatusCode() == HttpStatus.OK;
    }

    @Test
    public void testUserSpriteApi() {
        ResponseEntity<String> response = restTemplate.getForEntity(
                baseUrl("/api/usersprite"),
                String.class
        );
        System.out.println("UserSprite API Response: " + response.getBody());
        assert response.getStatusCode() == HttpStatus.OK;
    }

    @Test
    public void testTransactionApi() {
        ResponseEntity<String> response = restTemplate.getForEntity(
                baseUrl("/api/transaction"),
                String.class
        );
        System.out.println("Transaction API Response: " + response.getBody());
        assert response.getStatusCode() == HttpStatus.OK;
    }

    @Test
    public void testBattleRecordApi() {
        ResponseEntity<String> response = restTemplate.getForEntity(
                baseUrl("/api/battlerecord"),
                String.class
        );
        System.out.println("BattleRecord API Response: " + response.getBody());
        assert response.getStatusCode() == HttpStatus.OK;
    }

    @Test
    public void testSystemLogApi() {
        ResponseEntity<String> response = restTemplate.getForEntity(
                baseUrl("/api/systemlog"),
                String.class
        );
        System.out.println("SystemLog API Response: " + response.getBody());
        assert response.getStatusCode() == HttpStatus.OK;
    }
}
