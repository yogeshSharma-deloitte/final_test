package com.test.demo.services;

import com.test.demo.repository.UserRepository;
import com.test.demo.repository.ProductRepository;
import com.test.demo.entity.User;
import com.test.demo.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ProductRepository productRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User saveUser(User user) {
        if(!user.getEmail().isEmpty())
            return userRepository.save(user);
        else
            return null;
    }

    public User editUser(Long id, User updatedUser) {
        User user = userRepository.findById(id).orElse(null);
        if(user != null) {
            user.setEmail(updatedUser.getEmail());
            user.setUsername(updatedUser.getUsername());
            user.setId(updatedUser.getId());
            user.setPassword(updatedUser.getPassword());
            return userRepository.save(user);
        } else {
            return null;
        }
    }

    public void deleteUser(Long id) {
        User user = userRepository.findById(id).orElse(null);
        if(user != null)
            userRepository.delete(user);
    }

    public Long getProductCount() {
        return productRepository.count();
    }
}