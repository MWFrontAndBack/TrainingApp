package com.example.backendtreining.enities;

import com.example.backendtreining.enities.enums.TrainingType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "training")
public class Training {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTraining;

    private String name;

    private String description;
    private String imageSrc;

    @Enumerated(EnumType.STRING)

    private TrainingType typeOfTraining;

    public Training() {
    }

    @Override
    public String toString() {
        return "Training{" +
                "idTraining=" + idTraining +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", imageSrc='" + imageSrc + '\'' +
                ", typeOfTraining=" + typeOfTraining +
                '}';
    }
}
