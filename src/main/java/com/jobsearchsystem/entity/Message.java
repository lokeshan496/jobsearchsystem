package com.jobsearchsystem.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "message")
@Inheritance(strategy=InheritanceType.JOINED)
public class Message {
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int messageId;

	@NotNull
	private String description;
	
	@NotNull
	private LocalDate date;
	 
	public Message() {
		super();
	}
	
	public Message(int messageId, @NotNull String description, @NotNull LocalDate date) {
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
		return "Message [messageId=" + messageId + ", description=" + description + ", date=" + date + "]";
	}
}