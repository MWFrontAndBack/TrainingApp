package com.example.backendtreining.enities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "training")
@CrossOrigin
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

    @OneToMany(mappedBy = "training" ,cascade = CascadeType.ALL,orphanRemoval = true,fetch = FetchType.EAGER)
//    @JsonIgnore

    private List<Excercise> excerciseList = new ArrayList<>();

    public Training() {
    }

    public Training(Long idTraining, String name, String photo, String description, NormalUser normalUser, List<Excercise> excerciseList) {
        this.idTraining = idTraining;
        this.name = name;
        this.photo = photo;
        this.description = description;
        this.normalUser = normalUser;
        this.excerciseList = excerciseList;
    }


    public Long getIdTraining() {
        return idTraining;
    }

    public String getName() {
        return name;
    }

    public String getPhoto() {
        return photo;
    }

    public String getDescription() {
        return description;
    }

    public NormalUser getNormalUser() {
        return normalUser;
    }

    public List<Excercise> getExcerciseList() {
        return excerciseList;
    }

    public void setIdTraining(Long idTraining) {
        this.idTraining = idTraining;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setNormalUser(NormalUser normalUser) {
        this.normalUser = normalUser;
    }

    public void setExcerciseList(List<Excercise> excerciseList) {
        this.excerciseList = excerciseList;
    }

    @Override
    public String toString() {
        return "Training{" +
                "idTraining=" + idTraining +
                ", name='" + name + '\'' +
                ", photo='" + photo + '\'' +
                ", description='" + description + '\'' +
                ", excerciseList=" + excerciseList +
                '}';
    }
}