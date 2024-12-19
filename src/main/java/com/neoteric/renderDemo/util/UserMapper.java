package com.neoteric.renderDemo.util;

import com.neoteric.renderDemo.entity.UserEntity;
import com.neoteric.renderDemo.model.UserDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    @Autowired
    ModelMapper modelMapper;

    public UserEntity toEntity(UserDTO userDTO){


        return modelMapper.map(userDTO,UserEntity.class);

    }


    public UserDTO toDto(UserEntity userEntity){

        return modelMapper.map(userEntity,UserDTO.class);

    }
}
