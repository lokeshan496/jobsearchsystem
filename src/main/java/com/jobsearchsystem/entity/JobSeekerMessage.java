package com.jobsearchsystem.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "jobSeekerMessage")
public class JobSeekerMessage extends Message {
 
	@NotNull
	@ManyToOne
	@JoinColumn(name="Employer.userId")
	private Employer employer;
	
	public JobSeekerMessage() {
		super();
	}

	public JobSeekerMessage(@NotNull Employer employer) {
		super();
		this.employer = employer;
	}

	public Employer getEmployer() {
		return employer;
	}

	public void setEmployer(Employer employer) {
		this.employer = employer;
	}

	@Override
	public String toString() {
		return super.toString()+",employer=" + employer + "]";
	}	
}