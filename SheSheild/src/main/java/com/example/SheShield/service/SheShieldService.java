package com.example.SheShield.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SheShield.model.SafetyResource;
import com.example.SheShield.model.CandidateRegistry;
import com.example.SheShield.repository.CandidateRegistryRepo;
import com.example.SheShield.repository.SafetyResourceRepo;

@Service
public class SheShieldService {
    @Autowired
    SafetyResourceRepo safetyResourceRepo;

    @Autowired
    CandidateRegistryRepo candidateRegistryRepo;

	public List<SafetyResource> availableResources() {

		return safetyResourceRepo.findAll();
	}
	public List<CandidateRegistry> registeredCandidates() {

		return candidateRegistryRepo.findAll();
	}
	public void registerCandidate(String name, String emailId, String resourceName) {
		CandidateRegistry candidateRegistry = new CandidateRegistry(name, emailId, resourceName);
		candidateRegistryRepo.save(candidateRegistry);
	}
}