package com.example.backendtreining.initDb;

import com.example.backendtreining.enities.Excercise;
import com.example.backendtreining.enities.NormalUser;
import com.example.backendtreining.enities.Training;
import com.example.backendtreining.enities.enums.TrainingType;
import com.example.backendtreining.repositories.ExcerciseRepostitory;
import com.example.backendtreining.repositories.TrainingRepository;
import com.example.backendtreining.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class UserConfiguration {

    @Bean
    CommandLineRunner commandLineRunner(UserRepository userRepository, TrainingRepository trainingRepository, ExcerciseRepostitory excerciseRepostitory) {
        return args -> {
// Create a NormalUser object
            NormalUser user = new NormalUser();
            user.setFirstName("John");
            user.setLastName("Doe");
            user.setBirthDate(LocalDate.of(1990, 1, 1));
            user.setHeight(180.0);
            user.setWeight(80.0);
            user.setMail("niewiem.doe@example.com");
            user.setPhoto("photo.jpg");

            NormalUser user2 = new NormalUser();
            user2.setFirstName("Dawid");
            user2.setLastName("Podsiadło");
            user2.setBirthDate(LocalDate.of(2000, 2, 12));
            user2.setHeight(170.0);
            user2.setWeight(100.0);
            user2.setMail("podsiadło.doe@example.com");
            user2.setPhoto("photo.jpg");


// Create a Training object and add it to the NormalUser's trainingsList
            Training training = new Training();
            training.setName("FullBody Workout");
            training.setPhoto("https://i.pinimg.com/736x/b3/fe/56/b3fe563baa6901ea4c4e1ae8cd1cba7a.jpg");
            training.setDescription("A full body workout is just what it sounds like: a workout that aims to hit all the major muscle groups in one single session");
            training.setNormalUser(user);
            user.getTrainingsList().add(training);



            Training training2 = new Training();
            training2.setName("Strength Workout");
            training2.setPhoto("https://superherojacked.b-cdn.net/wp-content/uploads/2018/07/Goku-Workout-2.jpg");
            training2.setDescription("Strength training or resistance training involves the performance of physical exercises that are designed to improve strength and endurance.");
            training2.setNormalUser(user2);
            training2.setNormalUser(user);
            user2.getTrainingsList().add(training2);
            user.getTrainingsList().add(training2);

            Training endurance = new Training();
            endurance.setName("Endurance Workout");
            endurance.setPhoto("https://api.duniagames.co.id/api/content/upload/file/13331515541642049602.jpg");
            endurance.setDescription("Simply put, aerobic exercise, or cardio, is anything that elevates your heart rate");
            endurance.setNormalUser(user2);
            user2.getTrainingsList().add(endurance);


// Create an Excercise object and add it to the Training's excerciseList
            Excercise excercise = new Excercise();
            excercise.setName("Bench Press");
            excercise.setPhoto("bench.jpg");
            excercise.setCalories(100);
            excercise.setTrainingType(TrainingType.WEGETARIANSKIE);
            excercise.setTraining(training);
            training.getExcerciseList().add(excercise);

            Excercise excercise2 = new Excercise();
            excercise2.setName("Leg Press");
            excercise2.setPhoto("legs.jpg");
            excercise2.setCalories(100);
            excercise2.setTrainingType(TrainingType.WEGETARIANSKIE);
            excercise2.setTraining(training);
            training2.getExcerciseList().add(excercise2);
            List<NormalUser> userList = new ArrayList<>();
            userList.add(user);
            userList.add(user2);
        userRepository.saveAll(userList);
        };
    }
}