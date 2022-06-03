package com.jobsearchsystem.model;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

 
@Component
public class MessageDTO {

	private int messageId;
	private String description;
	private LocalDate date;

	public MessageDTO() {
		super();
	}

	public MessageDTO(int messageId, String description, LocalDate date) {
		super();
		this.messageId = messageId;
		this.description = description;
		this.date = date;
	}

	public int getMessageId() {
		return messageId;
	}

	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "MessageDTO [messageId=" + messageId + ", description=" + description + ", date=" + date + "]";
	}
}