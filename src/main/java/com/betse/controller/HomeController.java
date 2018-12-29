package com.betse.controller;

//import com.betse.entity.User;
//import com.betse.repository.UserRepository;
//import com.betse.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
/*
    private final UserRepository userRepository;
    private final UserService userService;

    public HomeController(UserRepository userRepository, UserService userService) {
        this.userRepository = userRepository;
        this.userService = userService;
    }
*/
    @RequestMapping("/")
    public String index(){
        return "index";
    }
/*
    @GetMapping("/admin")
    @ResponseBody
    public String admin(){
        return "admin";
    }

    @GetMapping("/create-user")
    @ResponseBody
    public String createUser(){
        User user = new User();
        user.setLogin("admin");
        user.setPassword("admin");
        userService.saveUser(user);
        return "-CREATED-";
    }
*/
}
