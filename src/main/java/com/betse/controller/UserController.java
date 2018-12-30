package com.betse.controller;

import com.betse.entity.User;
import com.betse.repository.UserRepository;
import com.betse.service.UserService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    /* */
    private final UserRepository userRepository;

    private UserService userService;

    public UserController(UserRepository userRepository){
        this.userRepository = userRepository;
        this.userService = userService;
    }

    @GetMapping
    public List<User> findAllUsers(){
        return userService.findAllUsers();
    }

    /*
    @RequestMapping("/list")
    public String list(Model model){
        model.addAttribute("users", userRepository.findAll());
        return "user/list";
    }

    @RequestMapping("list-page")
    public String listPage(Model model, Pageable pageable){
        Page<User> page = userRepository.findAll(pageable);
        model.addAttribute("page", page);
        return "user/ist-page";
    }

    @GetMapping("/remove/{login}")
    public String remove(@PathVariable String login) {
        userRepository.delete(login);
        return "redirect:/user/list";
    }

    @GetMapping("/add")
    public String add(Model model){
        model.addAttribute("user", new User());
        return "user/add";
    }

    */
}
