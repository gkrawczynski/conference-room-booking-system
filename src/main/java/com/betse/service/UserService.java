package com.betse.service;
import com.betse.entity.User;

import java.util.List;

public interface UserService {

    User findByUserLogin(String login);

    List<User> findAllUsers();

    void saveUser(User user);

    void deleteUser(User user);
}
