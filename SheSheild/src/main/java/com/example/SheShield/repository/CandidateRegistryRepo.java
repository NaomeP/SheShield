package com.example.SheShield.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SheShield.model.CandidateRegistry;

@Repository
public interface CandidateRegistryRepo extends JpaRepository<CandidateRegistry,Integer> {
}