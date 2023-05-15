package com.example.backendtreining.controllers;

import com.example.backendtreining.dto.TrainingDTO;
import com.example.backendtreining.dto.mapperUtils.MapperUtil;
import com.example.backendtreining.enities.Training;
import com.example.backendtreining.repositories.TrainingRepository;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
import java.util.Map;

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
    @ResponseBody
    public List<TrainingDTO> getTrainings() throws IOException {
        List<Training> all = trainingRepository.findAll();
        List<TrainingDTO> mapped = all.stream().map((a) -> MapperUtil.map(a, TrainingDTO.class)).toList();
        return mapped;
    }
}