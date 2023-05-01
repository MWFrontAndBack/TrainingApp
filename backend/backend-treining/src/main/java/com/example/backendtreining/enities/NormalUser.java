package com.example.backendtreining.enities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "normaluser")
public class NormalUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private Double height;
    private Double weight;
    private String mail;
    private String photo;
    @OneToMany(mappedBy = "normalUser" ,cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Training> trainingsList = new ArrayList<>();

    public NormalUser() {
    }

    @Override
    public String toString() {
        return "NormalUser{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                ", height=" + height +
                ", weight=" + weight +
                ", mail='" + mail + '\'' +
                ", photo='" + photo + '\'' +
                ", trainingsList=" + trainingsList +
                '}';
    }
}
