package com.jobsearchsystem.model;


import org.springframework.stereotype.Component;
 
@Component
public class EmployerMessageDTO extends MessageDTO {
 
	private JobSeekerDTO jobSeekerDTO;
	
	public EmployerMessageDTO() {
		super();
	}

	public EmployerMessageDTO(JobSeekerDTO jobSeekerDTO) {
		super();
		this.jobSeekerDTO = jobSeekerDTO;
	}

	public JobSeekerDTO getJobSeekerDTO() {
		return jobSeekerDTO;
	}

	public void setJobSeekerDTO(JobSeekerDTO jobSeekerDTO) {
		this.jobSeekerDTO = jobSeekerDTO;
	}

	@Override
	public String toString() {
		return "EmployerMessageDTO [jobSeekerDTO=" + jobSeekerDTO + "]";
	}

}