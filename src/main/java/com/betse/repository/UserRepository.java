package com.betse.repository;

import com.betse.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
    User findByUsername(String username);

    User findByUserlogin(String userlogin);
}
