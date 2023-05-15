package com.example.backendtreining.repositories;

import com.example.backendtreining.enities.Excercise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExcerciseRepostitory extends JpaRepository<Excercise,Long> {
}