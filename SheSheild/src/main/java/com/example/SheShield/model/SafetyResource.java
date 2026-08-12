package com.example.SheShield.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class SafetyResource {
	@Id
	private String resourceId;
	private String resourceName;
	private String providedBy;
	private int availabilityInHours;
	public SafetyResource() {
		super();
	}
	public SafetyResource(String resourceId, String resourceName, String providedBy, int availabilityInHours) {
		super();
		this.resourceId = resourceId;
		this.resourceName = resourceName;
		this.providedBy = providedBy;
		this.availabilityInHours = availabilityInHours;
	}
	public String getResourceId() {
		return resourceId;
	}
	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}
	public String getResourceName() {
		return resourceName;}
	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;}
	public String getProvidedBy() {
		return providedBy;
	}
	public void setProvidedBy(String providedBy) {
		this.providedBy = providedBy;
	}
	public int getAvailabilityInHours() {
		return availabilityInHours;
	}
	public void setAvailabilityInHours(int availabilityInHours) {
		this.availabilityInHours = availabilityInHours;
	}

}