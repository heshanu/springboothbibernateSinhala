package com.sinhala.sinhalaSpringboot.controller;

import com.sinhala.sinhalaSpringboot.dto.UserDTO;
import com.sinhala.sinhalaSpringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/v1/user")
@CrossOrigin
public class UserController {
    @Autowired(required=true)
    private UserService userService;

    @GetMapping
    public String hello() {
        return "hi";
    }

    //path api/v1/user/getUser
    @GetMapping(path = "/getUser")
    public String User() {
        return "hi-user";
    }

    //api/v1/user/m
    @GetMapping(path = "/m")
    public int m() {
        return 1 + 2;
    }

    @PostMapping(path = "/saveUser")
    public UserDTO saveUser(@RequestBody UserDTO userDTO) {
        return userService.saveUser(userDTO);
    }

    @PutMapping(path = "/updateUser")
    public String getUser() {
        return "user update";
    }

    @DeleteMapping(path = "/deleteUser")
    public String deleteUser() {
        return "delete user";
    }


}
