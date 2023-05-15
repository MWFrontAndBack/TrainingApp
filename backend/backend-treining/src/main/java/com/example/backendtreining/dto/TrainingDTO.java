package com.example.backendtreining.dto;

import com.example.backendtreining.enities.Excercise;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TrainingDTO {
    private Long id;
    private String name;
    private String photo;
    private String description;
    private List<Excercise> excerciseList;



}