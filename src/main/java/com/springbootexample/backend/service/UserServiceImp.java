/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springbootexample.backend.service;

import com.springbootexample.backend.dto.UserViewDTO;
import com.springbootexample.backend.exception.NotFoundException;
import com.springbootexample.backend.model.User;
import com.springbootexample.backend.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor//Consructor oluşturuyor
@Service
public class UserServiceImp implements UserService{

    private final UserRepository userRepository;
    
    @Override
    public UserViewDTO getUserById(Long id) {
       final User user = userRepository.findById(id).orElseThrow(()-> new NotFoundException("NotFoundException"));
        return UserViewDTO.of(user);
    }
    
}
