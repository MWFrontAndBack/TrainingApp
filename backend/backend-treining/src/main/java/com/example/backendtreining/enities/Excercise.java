package com.example.backendtreining.enities;

import com.example.backendtreining.enities.enums.TrainingType;
import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @JoinColumn(name = "id_training")
    private Training training;

    public Excercise() {
    }

    public Excercise(Long id, String name, String photo, int calories, TrainingType trainingType, Training training) {
        this.id = id;
        this.name = name;
        this.photo = photo;
        this.calories = calories;
        this.trainingType = trainingType;
        this.training = training;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setTrainingType(TrainingType trainingType) {
        this.trainingType = trainingType;
    }
    @JsonIgnore
    public void setTraining(Training training) {
        this.training = training;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhoto() {
        return photo;
    }

    public int getCalories() {
        return calories;
    }

    public TrainingType getTrainingType() {
        return trainingType;
    }
    @JsonIgnore
    public Training getTraining() {
        return training;
    }

    @Override
    public String toString() {
        return "Excercise{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", photo='" + photo + '\'' +
                ", calories=" + calories +
                ", trainingType=" + trainingType +
                '}';
    }
}