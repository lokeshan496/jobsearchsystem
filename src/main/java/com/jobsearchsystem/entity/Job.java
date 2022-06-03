package com.jobsearchsystem.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
public class Job {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int jobId;
	
	@NotNull
	private String jobTitle;
	
	@NotNull
	private String location;
	
	@NotNull
	private String description;
	
	@Min(2)
	private int experience;
	
	@Min(30000)
	private double salary;
	
	@Min(1)
	private int noticePeriod;
	
	@NotNull
	private String contactEmail;
	
	@NotNull
	private String status;
	

	public Job() {
		super();
	}


	public Job(int jobId, @NotNull String jobTitle, @NotNull String location, @NotNull String description,
			@Min(2) int experience, @Min(30000) double salary, @Min(1) int noticePeriod, @NotNull String contactEmail,
			String status) {
		this.jobId = jobId;
		this.jobTitle = jobTitle;
		this.location = location;
		this.description = description;
		this.experience = experience;
		this.salary = salary;
		this.noticePeriod = noticePeriod;
		this.contactEmail = contactEmail;
		this.status = status;
	}


	public int getJobId() {
		return jobId;
	}


	public void setJobId(int jobId) {
		this.jobId = jobId;
	}


	public String getJobTitle() {
		return jobTitle;
	}


	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public int getExperience() {
		return experience;
	}


	public void setExperience(int experience) {
		this.experience = experience;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public int getNoticePeriod() {
		return noticePeriod;
	}


	public void setNoticePeriod(int noticePeriod) {
		this.noticePeriod = noticePeriod;
	}


	public String getContactEmail() {
		return contactEmail;
	}


	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	@Override
	public String toString() {
		return "Job [jobId=" + jobId + ", jobTitle=" + jobTitle + ", location=" + location + ", description="
				+ description + ", experience=" + experience + ", salary=" + salary + ", noticePeriod=" + noticePeriod
				+ ", contactEmail=" + contactEmail + ", status=" + status + "]";
	}
 
	
}
