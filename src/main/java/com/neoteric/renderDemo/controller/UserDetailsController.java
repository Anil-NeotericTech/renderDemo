package com.neoteric.renderDemo.controller;

import com.neoteric.renderDemo.entity.UserEntity;
import com.neoteric.renderDemo.model.UserDTO;
import com.neoteric.renderDemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserDetailsController {

    @Autowired
    UserService service;

    @PostMapping(value = "/save-details",consumes = "application/json",produces = "application/json")
    public UserEntity saveDetails(@RequestBody UserDTO userDTO){
        return service.saveUserDetails(userDTO);

    }
}
