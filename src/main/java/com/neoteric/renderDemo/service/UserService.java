package com.neoteric.renderDemo.service;

import com.neoteric.renderDemo.entity.UserEntity;
import com.neoteric.renderDemo.model.UserDTO;
import com.neoteric.renderDemo.repo.UserRepository;
import com.neoteric.renderDemo.util.UserMapper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    UserMapper userMapper;


    public UserEntity saveUserDetails(UserDTO userDTO){

        UserEntity userDetails= userMapper.toEntity(userDTO);

        return userRepository.save(userDetails);

    }


}
