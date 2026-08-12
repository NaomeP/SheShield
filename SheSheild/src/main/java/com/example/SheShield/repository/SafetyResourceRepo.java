package com.example.SheShield.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SheShield.model.SafetyResource;

@Repository
public interface SafetyResourceRepo extends JpaRepository<SafetyResource,String> {
}