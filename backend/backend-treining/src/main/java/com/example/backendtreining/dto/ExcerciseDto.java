package com.example.backendtreining.dto;

import com.example.backendtreining.enities.enums.TrainingType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ExcerciseDto {
    private Long id;
    private String name;
    private String photo;
    private int calories;
    private TrainingType trainingType;


}