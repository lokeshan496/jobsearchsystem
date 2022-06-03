package com.jobsearchsystem.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

@Entity
public class JobSeeker extends User {
	
	@NotNull
	private String skillSet;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="JobSeekerMessage.messageId")
	private List<JobSeekerMessage>messages = new ArrayList<>();
	
	public JobSeeker() {
		super();
	}

	public JobSeeker(@NotNull String skillSet) {
		this.skillSet = skillSet;
	}

	public String getSkillSet() {
		return skillSet;
	}

	public void setSkillSet(String skillSet) {
		this.skillSet = skillSet;
	}

	
	public List<JobSeekerMessage> getMessages() {
		return messages;
	}

	public void setMessages(List<JobSeekerMessage> messages) {
		this.messages = messages;
	}

	@Override
	public String toString() {
		return "JobSeeker [skillSet=" + skillSet + "]";
	}
 
	
	

}
