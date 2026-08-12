package com.example.SheShield;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.SheShield.model.SafetyResource;
import com.example.SheShield.repository.SafetyResourceRepo;

@Configuration
public class DataLoader {
    @Bean
    CommandLineRunner loadSafetyResources(SafetyResourceRepo safetyResourceRepo) {
        return args -> {
            if (safetyResourceRepo.count() == 0) {
                safetyResourceRepo.save(new SafetyResource(
                    "R101",
                    "Self Defense Training",
                    "John",
                    6
                ));
                safetyResourceRepo.save(new SafetyResource(
                    "R102",
                    "Legal Aid Helpline",
                    "David",
                    8
                ));
                safetyResourceRepo.save(new SafetyResource(
                    "R103",
                    "Counseling Support",
                    "Smith",
                    5
                ));
                safetyResourceRepo.save(new SafetyResource(
                    "R104",
                    "Safety Awareness Workshop",
                    "Alex",
                    7
                ));
            }
        };
    }
}