package com.test.demo.repository;

import com.test.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Spring Data JPA repository for the User entity.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

Optional<User> findByUsername(String username);

Optional<User> findByEmail(String email);

Optional<User> findById(Long id);

}