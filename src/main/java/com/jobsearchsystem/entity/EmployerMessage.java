package com.jobsearchsystem.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
 

@Entity
public class EmployerMessage extends Message {
 
	@NotNull
	@ManyToOne
	@JoinColumn(name="JobSeeker.userId")
	private JobSeeker jobSeeker;
	
	public EmployerMessage() {
		super();
	}

	public EmployerMessage(@NotNull JobSeeker jobSeeker) {
		super();
		this.jobSeeker = jobSeeker;
	}

	public JobSeeker getJobSeeker() {
		return jobSeeker;
	}

	public void setJobSeeker(JobSeeker jobSeeker) {
		this.jobSeeker = jobSeeker;
	}

	@Override
	public String toString() {
		return "EmployerMessage [jobSeeker=" + jobSeeker + "]";
	}
}