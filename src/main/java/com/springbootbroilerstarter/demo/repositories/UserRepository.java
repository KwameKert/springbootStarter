package com.springbootbroilerstarter.demo.repositories;

import com.springbootbroilerstarter.demo.domains.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
    User findByUsernameAndPassword(String username, String password);
    User findByUsername(String username);

}
