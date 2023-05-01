package com.example.backendtreining.enities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "training")
public class Training {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTraining;

    private String name;
    private String photo;

    private String description;

    @ManyToOne
    @JoinColumn(name = "normal_user_id")
    private NormalUser normalUser;

    @OneToMany(mappedBy = "training" ,cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Excercise> excerciseList;

    public Training() {
    }

    @Override
    public String toString() {
        return "Training{" +
                "idTraining=" + idTraining +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", imageSrc='" + photo + '\'' +
                '}';
    }
}
