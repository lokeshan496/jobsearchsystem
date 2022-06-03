package com.jobsearchsystem.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class JobSeekerDTO extends UserDTO {
	 
	private String skillSet;
	
	private List<JobSeekerMessageDTO>messages = new ArrayList<>();

	public JobSeekerDTO() {
		super();
	}

	public JobSeekerDTO(String skillSet, List<JobSeekerMessageDTO> messages) {
		super();
		this.skillSet = skillSet;
		this.messages = messages;
	}

	public String getSkillSet() {
		return skillSet;
	}

	public void setSkillSet(String skillSet) {
		this.skillSet = skillSet;
	}

	public List<JobSeekerMessageDTO> getMessages() {
		return messages;
	}

	public void setMessages(List<JobSeekerMessageDTO> messages) {
		this.messages = messages;
	}

	@Override
	public String toString() {
		return "JobSeekerDTO [skillSet=" + skillSet + ", messages=" + messages + "]";
	}
}