package com.lee.javacloudapi;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class JavaCloudApiApplicationTests {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void contextLoads() {
        // Just checks if the Spring context starts without errors
    }

    @Test
    void helloEndpointShouldReturnGreeting() {
        ResponseEntity<String> response = restTemplate.getForEntity("/api/hello", String.class);
        assertThat(response.getBody()).isEqualTo("Hello from Java Cloud API!");
    }
    @Test
    void addEndpointShouldReturnResult() {
        ResponseEntity<String> response = restTemplate.getForEntity("/api/add", String.class);
        assertThat(response.getBody()).isEqualTo("Result: 111");
    }

}
