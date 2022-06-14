package com.sinhala.sinhalaSpringboot.service;

import com.sinhala.sinhalaSpringboot.dto.UserDTO;
import com.sinhala.sinhalaSpringboot.entity.User;
import com.sinhala.sinhalaSpringboot.repository.UserRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserService {

    @Autowired(required = false)
    private UserRepo userRepo;
    private ModelMapper modelMapper;

    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public UserDTO saveUser(UserDTO userDTO) {
        //userRepo.save(modelMapper.map(userDTO, User.class));
        userRepo.save(modelMapper.map(userDTO, User.class));
        return userDTO;
    }
}
