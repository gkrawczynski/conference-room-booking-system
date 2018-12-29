package com.betse.controller;
/*
import com.betse.entity.User;
import com.betse.repository.UserRepository;
import com.betse.storage.StorageService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping("/user")
public class UserController {

    private final UserRepository userRepository;
    private final StorageService storageService;

    public UserController(UserRepository userRepository, StorageService storageService){
        this.userRepository = userRepository;
        this.storageService = storageService;
    }

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

    @PostMapping("/add")
    public String addPersonPerform(@RequestParam("file") MultipartFile file, @ModelAttribute @Valid User user, BindingResult result, RedirectAttributes redirectAttributes){
        if(result.hasErrors()){
            return "user/add";
        }
        if(!file.isEmpty()){
            storageService.store(file);
        }

        redirectAttributes.addFlashAttribute("message", "User has been added.");

        userRepository.save(user);

        return "redirect:/user/list";
    }
}
*/