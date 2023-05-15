package com.example.backendtreining.dto;

import com.example.backendtreining.enities.Training;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NormaUserDTO {
    private  Long id;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private Double height;
    private Double weight;
    private String mail;
    private String photo;

    private List<Training> trainingsList = new ArrayList<>();

}