package com.jobsearchsystem.model;

import org.springframework.stereotype.Component;

@Component
public class JobDTO {
	
	 
	private int jobId;
	private String jobTitle;
	private String location;
	private String description;
	private int experience;
	private double salary;
	private int noticePeriod;
	private String contactEmail;
	private String status;
	
 
	public JobDTO() {
		super();
	}


	public JobDTO(int jobId, String jobTitle, String location, String description, int experience, double salary,
			int noticePeriod, String contactEmail, String status) {
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
		return "JobDTO [jobId=" + jobId + ", jobTitle=" + jobTitle + ", location=" + location + ", description="
				+ description + ", experience=" + experience + ", salary=" + salary + ", noticePeriod=" + noticePeriod
				+ ", contactEmail=" + contactEmail + ", status=" + status + "]";
	}
 
	
	

}
