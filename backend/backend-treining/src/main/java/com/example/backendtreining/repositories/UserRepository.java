package com.example.backendtreining.repositories;

import com.example.backendtreining.enities.NormalUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<NormalUser,Long> {
}