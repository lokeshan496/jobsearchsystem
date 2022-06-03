package com.jobsearchsystem.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class EmployerDTO extends UserDTO {
	 
	private String organizationName;
 	
	private List<EmployerMessageDTO>messages = new ArrayList<>();
	
	public EmployerDTO() {
		super();
	}

	public EmployerDTO(String organizationName, List<EmployerMessageDTO> messages) {
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


	public List<EmployerMessageDTO> getMessages() {
		return messages;
	}

	public void setMessages(List<EmployerMessageDTO> messages) {
		this.messages = messages;
	}

	@Override
	public String toString() {
		return "EmployerDTO [organizationName=" + organizationName + ", messages=" + messages + "]";
	}
}