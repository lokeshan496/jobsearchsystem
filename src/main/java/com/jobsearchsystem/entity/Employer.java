package com.jobsearchsystem.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
 
@Entity
public class Employer extends User {
	
	@NotNull
	private String organizationName;
 
	 @OneToMany(cascade = CascadeType.ALL)
	 @JoinColumn(name="EmployerMessage.messageId")
	 private List<EmployerMessage>messages = new ArrayList<>();
	 
	public Employer() {
		super();
	}


	public Employer(@NotNull String organizationName) {
		this.organizationName = organizationName;
	}

	public Employer(@NotNull String organizationName, List<EmployerMessage> messages) {
		super();
		this.organizationName = organizationName;
		this.messages = messages;
	}


	public String getOrganizationName() {
		return organizationName;
	}


	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}


	public List<EmployerMessage> getMessages() {
		return messages;
	}


	public void setMessages(List<EmployerMessage> messages) {
		this.messages = messages;
	}


	@Override
	public String toString() {
		return "Employer [organizationName=" + organizationName + ", messages=" + messages + "]";
	}
}