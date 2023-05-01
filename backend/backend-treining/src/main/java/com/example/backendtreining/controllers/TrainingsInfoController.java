package com.example.backendtreining.controllers;

import com.example.backendtreining.enities.Training;
import com.example.backendtreining.repositories.TrainingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/trainings")
@CrossOrigin

public class TrainingsInfoController {
    @Autowired
  private   TrainingRepository trainingRepository;
    @GetMapping("/welcome")
    public ResponseEntity<String> welome(){
        return ResponseEntity.ok("welcome");
    }

    @GetMapping()
    public List<String> getTrainings(){
        List<Training> all = trainingRepository.findAll();

        return all.stream().map((a)->a.getDescription()).toList();
    }
}
