package com.example.backendtreining.enities;

import com.example.backendtreining.enities.enums.TrainingType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "excercise")
public class Excercise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String photo;
    private int calories;
    @Enumerated(EnumType.STRING)
    private TrainingType trainingType;
    @ManyToOne
    @JoinColumn(name = "training_id")
    private Training training;

    public Excercise() {
    }

    @Override
    public String toString() {
        return "Excercise{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", photo='" + photo + '\'' +
                ", calories=" + calories +
                ", trainingType=" + trainingType +
                ", training=" + training +
                '}';
    }
}
