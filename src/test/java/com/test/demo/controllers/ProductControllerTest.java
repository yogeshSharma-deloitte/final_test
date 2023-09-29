package com.test.demo.controllers;

import com.test.demo.entity.Product;
import com.test.demo.services.UserService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@SpringBootTest
public class ProductControllerTest {

    @InjectMocks
    private ProductController productController;

    @MockBean
    private UserService userService;

    @Test
    public void getAllProductsTest() {
        when(userService.getProductCount()).thenReturn(1L);
        productController.getAllProducts();
        assertNotNull(userService.getProductCount());
    }

}