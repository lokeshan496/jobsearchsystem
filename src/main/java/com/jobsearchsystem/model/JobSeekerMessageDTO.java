package com.jobsearchsystem.model;
 
import org.springframework.stereotype.Component;

@Component
public class JobSeekerMessageDTO extends MessageDTO {
	
	private EmployerDTO employer;
	
	public JobSeekerMessageDTO() {
		super();
	}

	public JobSeekerMessageDTO(EmployerDTO employer) {
		super();
		this.employer = employer;
	}



	public EmployerDTO getEmployer() {
		return employer;
	}

	public void setEmployer(EmployerDTO employer) {
		this.employer = employer;
	}

	@Override
	public String toString() {
		return "JobSeekerMessageDTO [employer=" + employer + "]";
	}
}