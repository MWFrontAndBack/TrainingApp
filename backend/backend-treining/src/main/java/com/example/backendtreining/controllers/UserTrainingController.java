package com.example.backendtreining.controllers;

import com.example.backendtreining.dto.NormaUserDTO;
import com.example.backendtreining.dto.mapperUtils.MapperUtil;
import com.example.backendtreining.enities.NormalUser;
import com.example.backendtreining.repositories.TrainingRepository;
import com.example.backendtreining.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@RestController
@RequestMapping("user/trainings")
@CrossOrigin
public class UserTrainingController {
@Autowired
   private UserRepository userRepository;

@Autowired
private TrainingRepository trainingRepository;

    @GetMapping
    public NormaUserDTO getUserByid() {
        NormalUser normalUser = userRepository.findById(1L).orElseThrow();
        NormaUserDTO mappedUser = MapperUtil.map(normalUser, NormaUserDTO.class);
        return mappedUser ;
    }

}