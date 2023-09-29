package com.test.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class AcmeSpringbootProjectTest {

    @Test
    public void contextLoads() {
    }

    @Test
    public void main() {
        AcmeSpringbootProject.main(new String[] {});
        assertTrue(true);
    }

}