package com.test.demo.entity;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class UserTest {

    @Test
    public void testUser() {
        User user = new User();
        user.setId(1L);
        user.setUsername("test");
        user.setPassword("password");
        user.setEmail("test@test.com");

        assertNotNull(user);
        assertEquals(1L, user.getId());
        assertEquals("test", user.getUsername());
        assertEquals("password", user.getPassword());
        assertEquals("test@test.com", user.getEmail());
    }

    @Test
    public void testUserWithParameters() {
        User user = new User("test", "password", "test@test.com");

        assertNotNull(user);
        assertEquals("test", user.getUsername());
        assertEquals("password", user.getPassword());
        assertEquals("test@test.com", user.getEmail());
    }

    @Test
    public void testSettersAndGetters() {
        User user = new User();
        user.setId(1L);
        user.setUsername("test");
        user.setPassword("password");
        user.setEmail("test@test.com");

        assertEquals(1L, user.getId());
        assertEquals("test", user.getUsername());
        assertEquals("password", user.getPassword());
        assertEquals("test@test.com", user.getEmail());
    }
}