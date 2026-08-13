package com.example.SheShield.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.SheShield.model.SafetyResource;
import com.example.SheShield.model.CandidateRegistry;
import com.example.SheShield.service.SheShieldService;

import java.util.*;

@RestController
@CrossOrigin(origins="*")
public class SheShieldController {
	@Autowired
	SheShieldService sheShieldService;

	@GetMapping("resources")
	public List<SafetyResource> availableResources(){
		return sheShieldService.availableResources();
	}

	@GetMapping("candidates/registered")
	public List<CandidateRegistry> registeredCandidates(){
		return sheShieldService.registeredCandidates();

	}
	@PostMapping("/candidates/register")
	public String registerCandidate(@RequestParam("name") String name,
			@RequestParam("emailId") String emailId,
			@RequestParam("resourceName") String resourceName) {
		sheShieldService.registerCandidate(name,emailId,resourceName);
				return "Congratulations! "+name+" Registration Succesfuk for "+resourceName;

}
	@GetMapping("/")
public String home() {
    return "SheShield Backend is Running!";
}
}
