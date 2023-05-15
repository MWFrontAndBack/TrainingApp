package com.example.backendtreining.enities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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
    @OneToMany(mappedBy = "normalUser" ,cascade = CascadeType.ALL,orphanRemoval = true,fetch = FetchType.EAGER)
    @JsonIgnore

    private List<Training> trainingsList = new ArrayList<>();

    public NormalUser() {
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Double getHeight() {
        return height;
    }

    public Double getWeight() {
        return weight;
    }

    public String getMail() {
        return mail;
    }

    public String getPhoto() {
        return photo;
    }

    public List<Training> getTrainingsList() {
        return trainingsList;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public void setTrainingsList(List<Training> trainingsList) {
        this.trainingsList = trainingsList;
    }

    public NormalUser(Long id, String firstName, String lastName, LocalDate birthDate, Double height, Double weight, String mail, String photo, List<Training> trainingsList) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.height = height;
        this.weight = weight;
        this.mail = mail;
        this.photo = photo;
        this.trainingsList = trainingsList;
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