package com.betse.controller;
/*
import com.betse.entity.Room;
import com.betse.repository.RoomRepository;
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
@RequestMapping("/room")
public class RoomController {

    private final RoomRepository roomRepository;
    private final StorageService storageService;

    public RoomController(RoomRepository roomRepository, StorageService storageService) {
        this.roomRepository = roomRepository;
        this.storageService = storageService;
    }

    @RequestMapping("/list")
    public String list(Model model){
        model.addAttribute(("rooms"), roomRepository.findAll());
        return "user/list";
    }

    @RequestMapping("/list-page")
    public String listPage(Model model, Pageable pageable){
        Page<Room> page = roomRepository.findAll(pageable);
        model.addAttribute("page", page);
        return "room/list-page";
    }

    @GetMapping("/remove/{name}")
    public String remove(@PathVariable String name){
        roomRepository.delete(name);
        return "redirect:/room/list";
    }

    @GetMapping("/add")
    public String add(Model model){
        model.addAttribute("room", new Room());
        return "room/add";
    }

    @PostMapping("/add")
    public String addRoomPerform(@RequestParam("file")MultipartFile file, @ModelAttribute @Valid Room room, BindingResult result, RedirectAttributes redirectAttributes){
        if(result.hasErrors()){
            return "room/add";
        }
        if(!file.isEmpty()){
            storageService.store(file);
        }
        redirectAttributes.addFlashAttribute("message", "Room has been added.");

        roomRepository.save(room);

        return "redirect:/room/list";
    }
}
*/